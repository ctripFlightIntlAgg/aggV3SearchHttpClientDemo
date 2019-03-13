package com.ctrip.intlflight.search.tokenmanager.app;


import com.ctrip.intlflight.search.tokenmanager.entity.App;
import com.ctrip.intlflight.search.tokenmanager.entity.Token;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CopyOnWriteArrayList;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class AppTokenManager extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(AppTokenManager.class);
    public static final String ALIVE = "alive";
    public static final String EXPIRED = "expired";

    private CopyOnWriteArrayList<CerberusApp> apps = new CopyOnWriteArrayList<>();

    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private long updateInterval;

    public AppTokenManager() {
        this(60 * 60 * 1000L);
    }

    public AppTokenManager(long updateInterval) {
        this.updateInterval = updateInterval;
        this.setDaemon(true);
    }

    public void addApp(CerberusApp app) throws Exception {
        apps.add(doUpdate(app));
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                sleep(updateInterval);
                try {
                    doUpdate();
                } catch (Exception e) {
                    logger.error("Encounter an error as polling.", e);
                }
            }
        } catch (InterruptedException e) {
            logger.warn("Encounter an error while poller sleeping.", e);
        }
    }

    private void doUpdate() {
        apps.forEach(app -> {
            try {
                doUpdate(app);
            } catch (Exception e) {
                logger.warn("update failed for appId: " + app.getAppId(), e);
            }
        });
    }

    private CerberusApp doUpdate(CerberusApp cerberusApp) throws Exception {
        App[] result = objectMapper.readValue(AppClient.getApp(cerberusApp), new TypeReference<App[]>() {
        });
        App app = result[0];
        Token token = cerberusApp.getToken();
        if (app.getTokens() == null || app.getTokens().isEmpty()) {
            //max token num is 10, u can retry getApp if newToken failed
            token = objectMapper.readValue(AppClient.newToken(cerberusApp), Token.class);
        } else {
            for (Token t : app.getTokens()) {
                if (!ALIVE.equals(t.getStatus()) || t.getExpire() - System.currentTimeMillis() < updateInterval) {
                    AppClient.deleteToken(cerberusApp, t.getId());
                } else if (token == null || token.getExpire() < t.getExpire()) {
                    token = t;
                }
            }
        }
        cerberusApp.setToken(token);
        return cerberusApp;
    }
}
