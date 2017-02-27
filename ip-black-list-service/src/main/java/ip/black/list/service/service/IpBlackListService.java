package ip.black.list.service.service;

import ip.black.list.service.domain.IpBlackList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by niuqinghua on 2017/2/27.
 */
@Service("ipBlackListService")
public class IpBlackListService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void add(IpBlackList ipBlackList) {
        SetOperations<String, String> setOperations = getSetOperations();
        setOperations.add(getAppIdKey(ipBlackList), getValues(ipBlackList));
    }

    private String[] getValues(IpBlackList ipBlackList) {
        List<String> ipList = ipBlackList.getIpList();
        return ipList.toArray(new String[0]);
    }

    private String getAppIdKey(IpBlackList ipBlackList) {
        return getAppIdKey(ipBlackList.getAppId());
    }

    private String getAppIdKey(String appId) {
        return appId;
    }

    private SetOperations<String, String> getSetOperations() {
        return stringRedisTemplate.opsForSet();
    }

    public void remove(IpBlackList ipBlackList) {
        SetOperations<String, String> setOperations = getSetOperations();
        setOperations.remove(getAppIdKey(ipBlackList), getValues(ipBlackList));
    }

    public boolean isInIpBlackList(String appId, String ip) {
        SetOperations<String, String> setOperations = getSetOperations();
        return setOperations.isMember(getAppIdKey(appId), ip);
    }

    public List<String> list(IpBlackList ipBlackList) {
        SetOperations<String, String> setOperations = getSetOperations();
        Set<String> valueSet = setOperations.members(getAppIdKey(ipBlackList));
        return new ArrayList<String>(valueSet);
    }

}
