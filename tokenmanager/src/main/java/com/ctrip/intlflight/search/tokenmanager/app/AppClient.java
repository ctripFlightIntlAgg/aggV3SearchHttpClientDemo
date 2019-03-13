package com.ctrip.intlflight.search.tokenmanager.app;


import com.ctrip.intlflight.search.tokenmanager.http.HttpClient;
import com.ctrip.intlflight.search.tokenmanager.http.HttpMethod;
import com.ctrip.intlflight.search.tokenmanager.http.HttpRequest;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.apache.http.entity.StringEntity;

public class AppClient {
    private static final String APP_GET_URI = "/api/app/getApp";
    private static final String TOKEN_NEW_URI = "/api/app/token/create";
    private static final String TOKEN_DELETE_URI = "/api/app/token/delete";
    private static final String PRO_SCHEME = "https://";
    private static final String PRO_DOMAIN = "cerberus.ctrip.com";

    public static String getApp(CerberusApp app) throws Exception {
        HttpRequest.Buidler builer = new HttpRequest.Buidler()
                .method(HttpMethod.GET)
                .scheme(PRO_SCHEME)
                .domain(PRO_DOMAIN)
                .uri(APP_GET_URI)
                .addParam("appId", String.valueOf(app.getAppId()))
                .addParam("type", "detail");
        addSignParams(app, APP_GET_URI, builer);
        return HttpClient.execute(builer.build());
    }

    public static String newToken(CerberusApp app) throws Exception {
        HttpRequest.Buidler builer = new HttpRequest.Buidler()
                .method(HttpMethod.POST)
                .scheme(PRO_SCHEME)
                .domain(PRO_DOMAIN)
                .uri(TOKEN_NEW_URI)
                .addHeader("content-type", "application/json")
                .entity(new StringEntity("{\"appId\": " + app.getAppId() + "}"));
        addSignParams(app, TOKEN_NEW_URI, builer);
        return HttpClient.execute(builer.build());
    }

    public static String deleteToken(CerberusApp app, long tokenId) throws Exception {
        HttpRequest.Buidler builer = new HttpRequest.Buidler()
                .method(HttpMethod.GET)
                .scheme(PRO_SCHEME)
                .domain(PRO_DOMAIN)
                .uri(TOKEN_DELETE_URI)
                .addParam("tokenId", String.valueOf(tokenId));
        addSignParams(app, TOKEN_DELETE_URI, builer);
        return HttpClient.execute(builer.build());
    }

    private static void addSignParams(CerberusApp app, String uri, HttpRequest.Buidler buidler) {
        String timeStamp = String.valueOf(System.currentTimeMillis());
        String sign = uri.toLowerCase() + app.getAppKey() + timeStamp + app.getAppSecret();
        sign = Hashing.md5().hashString(sign, Charsets.UTF_8).toString().substring(8, 24);
        buidler.addParam("sign", sign);
        buidler.addParam("timeStamp", timeStamp);
        buidler.addParam("appKey", app.getAppKey());
    }
}
