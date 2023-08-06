package com.jasmine.core.cache.impl;

import com.jasmine.core.cache.CacheService;

/**
 * @author xieshanghan
 * @version RedisCacheServiceImpl.java, v 0.1 2023年08月06日 16:33 xieshanghan
 */
public class RedisCacheServiceImpl implements CacheService {

    @Override
    public void initDefaultLocalCache() {

    }

    @Override
    public Object getValueFromLocalCache(Object key) {
        return null;
    }

    @Override
    public Boolean putValueToLocalCache(Object key, Object value) {
        return null;
    }

}