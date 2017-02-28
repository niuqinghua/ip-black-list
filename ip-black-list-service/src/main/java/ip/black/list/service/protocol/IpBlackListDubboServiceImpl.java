package ip.black.list.service.protocol;

import ip.black.list.service.api.dto.IpBlackListDto;
import ip.black.list.service.api.protocol.IpBlackListDubboService;
import ip.black.list.service.domain.IpBlackList;
import ip.black.list.service.service.IpBlackListService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service("ipBlackListDubboService")
public class IpBlackListDubboServiceImpl implements IpBlackListDubboService {

    private static final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    @Autowired
    private IpBlackListService ipBlackListService;

    public void add(IpBlackListDto ipBlackListDto) {
        IpBlackList ipBlackList = dozerBeanMapper.map(ipBlackListDto, IpBlackList.class);
        ipBlackListService.add(ipBlackList);
    }

    public void remove(IpBlackListDto ipBlackListDto) {
        IpBlackList ipBlackList = dozerBeanMapper.map(ipBlackListDto, IpBlackList.class);
        ipBlackListService.remove(ipBlackList);
    }

    public boolean isInIpBlackList(String appId, String ip) {
        return ipBlackListService.isInIpBlackList(appId, ip);
    }

    public List<String> list(IpBlackListDto ipBlackListDto) {
        IpBlackList ipBlackList = dozerBeanMapper.map(ipBlackListDto, IpBlackList.class);
        return ipBlackListService.list(ipBlackList);
    }
}
