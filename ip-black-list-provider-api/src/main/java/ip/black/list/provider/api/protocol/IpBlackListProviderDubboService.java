package ip.black.list.provider.api.protocol;

import ip.black.list.provider.api.dto.IpBlackListCheckDto;

/**
 * Created by niuqinghua on 2017/2/27.
 */
public interface IpBlackListProviderDubboService {

    boolean isIpBlackList(IpBlackListCheckDto ipBlackListCheckDto);

}
