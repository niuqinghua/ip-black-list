package ip.black.list.provider.service;

import ip.black.list.provider.domain.Application;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service
public class AppService {

    @Cacheable
    public Boolean isValid(Application application) {
        return null;
    }

}
