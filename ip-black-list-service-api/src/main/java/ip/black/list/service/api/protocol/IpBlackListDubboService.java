package ip.black.list.service.api.protocol;

import ip.black.list.service.api.dto.IpBlackListDto;

import java.util.List;

/**
 * Created by niuqinghua on 2017/2/27.
 */
public interface IpBlackListDubboService {

    void add(IpBlackListDto ipBlackListDto);

    void remove(IpBlackListDto ipBlackListDto);

    boolean isInIpBlackList(String appId, String ip);

    List<String> list(IpBlackListDto ipBlackListDto);

}
