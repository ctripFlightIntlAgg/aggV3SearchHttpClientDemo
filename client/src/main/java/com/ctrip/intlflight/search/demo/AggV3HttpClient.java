package com.ctrip.intlflight.search.demo;

import com.ctrip.flight.intl.agg.types.searchrequesttype.v3.SearchRequestType;
import com.ctrip.flight.intl.agg.types.searchresponsetype.v3.SearchResponseType;
import com.ctrip.intlflight.search.callfomat.ZstdGoogleProtobuf3ContentFormatter;
import com.ctrip.intlflight.search.tokenmanager.app.AppTokenManager;
import com.ctrip.intlflight.search.tokenmanager.app.CerberusApp;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author tiantianhuang
 * @date 2019/3/4 20:08
 */

/**
 * http访问携程国际机票列表查询接口
 */
public class AggV3HttpClient {

    private static CloseableHttpAsyncClient httpAsyncClient = HttpAsyncClients.createDefault();

    // AppTokenManager&CerberusApp：携程合作商生产环境gateway验证用
    private static AppTokenManager appTokenManager;
    private static CerberusApp app;


    public static void main(String[] args) {
        try {
            // url说明详见Readme
            String baseUri = "https://apiproxy.ctrip.com/apiproxy/soa2/16427/zstd-protobuf-3/search";

            // 非生产环境不需要使用gateway验证
            initForProd();

            String completeURI = app.updateRequestUri(baseUri);
            HttpPost request = new HttpPost(completeURI);

            InputStream inputStream = convertRequest(MessageHelper.buildSearchRequest("test"));
            InputStreamEntity entity = new InputStreamEntity(inputStream, inputStream.available());
            request.setEntity(entity);

            httpAsyncClient.start();
            httpAsyncClient.execute(request, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse httpResponse) {
                    processResult(httpResponse);
                }

                @Override
                public void failed(Exception e) {
                    System.out.println("本次查询失败：");
                    e.printStackTrace();
                }

                @Override
                public void cancelled() {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 携程合作商生产环境使用
     */
    private static void initForProd() {
        try {
            appTokenManager = new AppTokenManager();
            app = new CerberusApp(236L, "8d154e5326a7478c", "b1ee02da162f3c6d8b8708004f5c3fff24b5e2e281e7ed1d6e22b1d1f7236002");
            appTokenManager.addApp(app);
            appTokenManager.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static InputStream convertRequest(SearchRequestType searchRequestType) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            ZstdGoogleProtobuf3ContentFormatter.INSTANCE.serialize(byteArrayOutputStream, searchRequestType);
            byte[] requestByteArray = byteArrayOutputStream.toByteArray();
            return new ByteArrayInputStream(requestByteArray);
        }
    }

    private static void processResult(HttpResponse httpResponse) {
        try {
            SearchResponseType result = null;
            // 检验返回码
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                System.out.println("fail");
                return;
            } else {
                InputStream responseInputStream = httpResponse.getEntity().getContent();
                result = ZstdGoogleProtobuf3ContentFormatter.INSTANCE.deserialize(SearchResponseType.class, responseInputStream);
            }
            if (result == null || result.getSearchResult() == null
                    || result.getSearchResult().getFlightProductGroupList() == null) {
                System.out.println("本次查询结果为空");
            } else {
                System.out.println(String.format("本次查询返回了%d个航组", result.getSearchResult().getFlightCount()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
