package com.ctrip.intlflight.search.tokenmanager.app;

import com.ctrip.intlflight.search.tokenmanager.entity.Token;
import com.ctrip.intlflight.search.tokenmanager.utils.Args;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

import java.util.concurrent.atomic.AtomicReference;

public class CerberusApp {
    private final Long appId;
    private final String appKey;
    private final String appSecret;
    private AtomicReference<Token> currentToken = new AtomicReference<>();

    public CerberusApp(Long appId, String appKey, String appSecret) {
        Args.notNull(appId, "appId");
        Args.notBlank(appKey, "appKey");
        Args.notBlank(appSecret, "appSecret");
        this.appId = appId;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public void setToken(Token token) {
        Args.notNull(token, "token");
        currentToken.set(token);
    }

    public Token getToken() {
        return currentToken.get();
    }

    public Long getAppId() {
        return appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String updateRequestUri(String baseuri){
        if (getToken() == null || getToken().getTokenValue() == null) {
            return baseuri;
            // throw new Exception("request failed, null token for app: " + getAppId());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(baseuri).append("?");
        String timeStamp = String.valueOf(System.currentTimeMillis());
        String sign = baseuri.toLowerCase() + getToken().getTokenValue() + timeStamp + getAppSecret();
        sign = Hashing.md5().hashString(sign, Charsets.UTF_8).toString().substring(8, 24);
        sb.append("&").append("sign").append("=").append(sign);
        sb.append("&").append("timeStamp").append("=").append(timeStamp);
        sb.append("&").append("token").append("=").append(getToken().getTokenValue());
        return sb.toString();
    }
}
