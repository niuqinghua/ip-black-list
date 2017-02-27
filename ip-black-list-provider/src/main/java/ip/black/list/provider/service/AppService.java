package ip.black.list.provider.service;

import ip.black.list.provider.common.Constants;
import ip.black.list.provider.domain.Application;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service
public class AppService {

    @Cacheable(cacheNames = Constants.IP_BLACK_LIST_APP,
            key = "#condition.userId + '-' + #condition.appId + '-' + #condition.token",
            unless = "#result==null")
    public Boolean isValid(Application application) {
        return null;
    }

}
