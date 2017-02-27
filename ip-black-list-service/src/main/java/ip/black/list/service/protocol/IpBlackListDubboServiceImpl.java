package ip.black.list.service.protocol;

import ip.black.list.service.api.dto.IpBlackListDto;
import ip.black.list.service.api.protocol.IpBlackListDubboService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service("ipBlackListDubboService")
public class IpBlackListDubboServiceImpl implements IpBlackListDubboService {

    public void add(IpBlackListDto ipBlackListDto) {

    }

    public void remove(IpBlackListDto ipBlackListDto) {

    }

    public boolean isInIpBlackList(String appId, String ip) {
        return false;
    }

    public List<String> list(IpBlackListDto ipBlackListDto) {
        return null;
    }
}
