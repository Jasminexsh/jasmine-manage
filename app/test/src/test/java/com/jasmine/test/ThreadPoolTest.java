package com.jasmine.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author xieshanghan
 * @version ThreadPoolTest.java, v 0.1 2023年07月28日 17:19 xieshanghan
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("Thread-Pool-Test-%d").build();
        ScheduledExecutorService scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);

        long period = 1L;
        scheduledThreadPoolExecutor.scheduleAtFixedRate(() -> {
            System.out.println("[" +  new Date() + "]" + "before switch interval");
        }, 1L, period, TimeUnit.SECONDS);

        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduledThreadPoolExecutor.shutdown();
        scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        period = 5L;
        scheduledThreadPoolExecutor.scheduleAtFixedRate(() -> {
            System.out.println("[" +  new Date() + "]" + "after switch interval");
        }, 1L, period, TimeUnit.SECONDS);
    }

}