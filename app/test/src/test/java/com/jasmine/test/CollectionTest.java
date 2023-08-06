package com.jasmine.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xieshanghan
 * @version CollectionTest.java, v 0.1 2023年06月07日 16:05 xieshanghan
 */
public class CollectionTest {


    public static void main(String[] args) {
        Queue<String> testStringQueue = new ArrayBlockingQueue<>(10);
        testStringQueue.offer("1");
        testStringQueue.offer("2");
        testStringQueue.offer("3");
        System.out.println(testStringQueue.size());

        File file = new File("/Users/xieshanghan/Desktop/xsh.txt");
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            Instant instant = basicFileAttributes.lastModifiedTime().toInstant();
            System.out.println(instant);
            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
            System.out.println(zonedDateTime);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

}