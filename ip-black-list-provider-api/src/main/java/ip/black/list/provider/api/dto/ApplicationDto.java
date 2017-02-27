package ip.black.list.provider.api.dto;

import java.io.Serializable;

/**
 * Created by niuqinghua on 2017/2/27.
 */
public class ApplicationDto implements Serializable {

    private String userId;

    private String appId;

    private String token;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
