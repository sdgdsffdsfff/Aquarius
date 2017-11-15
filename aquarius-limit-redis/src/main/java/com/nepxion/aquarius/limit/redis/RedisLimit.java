package com.nepxion.aquarius.limit.redis;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

public interface RedisLimit {
    /**
     * 在给定的时间段里最多的访问限制次数，如果超出false
     * @param name 资源名字
     * @param key 资源Key。在Redis中存储的Key为prefix + "_" + name + "_" + key
     * @param limitPeriod 给定的时间段(单位为秒)
     * @param limitCount 最多的访问限制次数
     * @param lockPeriod
     * @param lockCount
     * @param limitLockEnabled
     * @return
     */
    boolean tryAccess(String name, String key, int limitPeriod, int limitCount, int lockPeriod, int lockCount, boolean limitLockEnabled);
}