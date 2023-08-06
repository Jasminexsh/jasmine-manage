package com.jasmine.core.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author xieshanghan
 * @version FileTest.java, v 0.1 2023年06月09日 17:43 xieshanghan
 */
public class FileTest {

    @Test
    public void testGetFileLines() {
        File file = new File("/Users/xieshanghan/Desktop/10005.txt");
        try {
            long count = Files.lines(file.toPath()).count();
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadLines() {
        try {
            String flowFilePath = "/Users/xieshanghan/Desktop/10005.txt";
            File file = new File(flowFilePath);
            List<String> allLines = Files.readAllLines(file.toPath());
            Executors.newFixedThreadPool(1);
            System.out.println(allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetFileNameFromDir() {
        try {
            String parentDir = "/Users/xieshanghan/test";
            File file = new File(parentDir);
            if (file.exists() && file.isDirectory()) {
                String[] filesName = file.list();
                for (String fileName : filesName) {
                    System.out.println(fileName);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

}