package com.jasmine.core.cache.impl;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author xieshanghan
 * @version DefaultGuavaLocalCacheLoader.java, v 0.1 2023年08月05日 23:42 xieshanghan
 */
public class DefaultGuavaLocalCacheLoader extends CacheLoader<Object, Object> {

    private List<String> defaultLocalCacheValue = Lists.newArrayList("a", "b", "c", "d", "e");

    @Override
    public Object load(Object key) throws Exception {
        System.out.println(Thread.currentThread().getName() + " 重新加载数据开始");
        TimeUnit.SECONDS.sleep(3);
        Random random = new Random();
        System.out.println(Thread.currentThread().getName() + " 重新加载数据结束");
        return defaultLocalCacheValue.get(random.nextInt(5));
    }

}