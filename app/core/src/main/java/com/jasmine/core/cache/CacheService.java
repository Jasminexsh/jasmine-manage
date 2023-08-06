package com.jasmine.core.cache;

/**
 * 缓存服务
 *
 * @author xieshanghan
 * @version CacheService.java, v 0.1 2023年08月05日 23:39 xieshanghan
 */
public interface CacheService {

    void initDefaultLocalCache();

    Object getValueFromLocalCache(Object key);

    Boolean putValueToLocalCache(Object key, Object value);

}