package com.jasmine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 应用启动类
 *
 * @author xieshanghan
 * @version com.jasmine.JasmineSpringBootApplication.java, v 0.1 2023年06月09日 13:13 xieshanghan
 */
@EnableScheduling
@SpringBootApplication
public class JasmineSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JasmineSpringBootApplication.class, args);
    }

}