package ip.black.list.provider.api.dto;

import java.io.Serializable;

/**
 * Created by niuqinghua on 2017/2/27.
 */
public class IpBlackListCheckDto implements Serializable {

    private ApplicationDto app;

    private String ip;

    public ApplicationDto getApp() {
        return app;
    }

    public void setApp(ApplicationDto app) {
        this.app = app;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
