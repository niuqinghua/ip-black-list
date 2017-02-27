package ip.black.list.service.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by niuqinghua on 2017/2/27.
 */
public class IpBlackListDto implements Serializable {

    private String appId;

    private List<String> ipList;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }
}
