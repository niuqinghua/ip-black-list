package ip.black.list.provider.service;

import ip.black.list.provider.common.Constants;
import ip.black.list.provider.domain.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service
public class IpBlackListService {

    @Autowired
    private AppService appService;

    @Cacheable(cacheNames = Constants.IP_BLACK_LIST_APP,
            key = "#p0.userId + '-' + #p0.appId + '-' + #p0.token + '-' + #p1",
            unless = "#result==null")
    public Boolean isIpBlackList(Application application, String ip) {
        boolean isValidApp = appService.isValid(application);

        if (!isValidApp) {
            return false;
        }

        return null;
    }

}
