package ip.black.list.provider.protocol;

import ip.black.list.provider.api.dto.IpBlackListCheckDto;
import ip.black.list.provider.api.protocol.IpBlackListProviderDubboService;
import ip.black.list.provider.domain.Application;
import ip.black.list.provider.service.IpBlackListService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service("ipBlackListProviderDubboService")
public class IpBlackListProviderDubboServiceImpl implements IpBlackListProviderDubboService {

    @Autowired
    private IpBlackListService ipBlackListService;

    private static final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    public boolean isIpBlackList(IpBlackListCheckDto ipBlackListCheckDto) {
        Application application = dozerBeanMapper.map(ipBlackListCheckDto.getApp(), Application.class);
        return ipBlackListService.isIpBlackList(application, ipBlackListCheckDto.getIp());
    }

}
