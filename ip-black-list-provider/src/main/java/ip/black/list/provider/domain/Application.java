package ip.black.list.provider.domain;

import java.io.Serializable;

/**
 * Created by niuqinghua on 2017/2/27.
 */
public class Application implements Serializable {

    private String userId;

    private String app;

    private String token;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
