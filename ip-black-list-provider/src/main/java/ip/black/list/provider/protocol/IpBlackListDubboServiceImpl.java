package ip.black.list.provider.protocol;

import ip.black.list.provider.api.dto.IpBlackListCheckDto;
import ip.black.list.provider.api.protocol.IpBlackListDubboService;
import ip.black.list.provider.service.IpBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service("ipBlackListDubboService")
public class IpBlackListDubboServiceImpl implements IpBlackListDubboService {

    @Autowired
    private IpBlackListService ipBlackListService;

    public boolean isIpBlackList(IpBlackListCheckDto ipBlackListCheckDto) {
        return false;
    }

}
