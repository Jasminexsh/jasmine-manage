package com.jasmine.core.cache.impl;

import com.jasmine.core.cache.CacheService;
import com.jasmine.core.cache.impl.GuavaLocalCacheServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author xieshanghan
 * @version GuavaLocalCacheServiceTest.java, v 0.1 2023年08月06日 16:02 xieshanghan
 */
public class GuavaLocalCacheServiceTest {

    private static final int HASH_NUM = 5;

    private CacheService cacheService;

    private List<String> alphabetList;

    @Before
    public void prepare() {
        //初始化alphabetList
        alphabetList = new ArrayList<>();
        alphabetList.add("a");
        alphabetList.add("b");
        alphabetList.add("c");
        alphabetList.add("d");
        alphabetList.add("e");
        //初始化cacheService
        cacheService = new GuavaLocalCacheServiceImpl();
    }

    @Test
    public void test() {
        try {
            //初始化缓存
            cacheService.initDefaultLocalCache();
            //向缓存中插入元素
            for (int i = 0; i < HASH_NUM; i++) {
                cacheService.putValueToLocalCache(i, getValueFromKey(i));
            }
            //50次循环，从缓存中取元素
            for (int i = 0; i < 50; i++) {
                Random random = new Random();
                int index = random.nextInt(5);
                String value = (String) cacheService.getValueFromLocalCache(index);
                System.out.println(new Date() + " cache key: " + index + ", cache value: " + value);
                //取完元素后，间隔3秒
                Thread.sleep(3000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String getValueFromKey(int key) {
        if (key < 0) {
            return null;
        }
        int index = key % HASH_NUM;
        return alphabetList.get(index);
    }

}