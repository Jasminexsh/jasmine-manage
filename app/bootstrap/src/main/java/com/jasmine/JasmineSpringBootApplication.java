package com.jasmine;

import com.jasmine.util.LoggerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(JasmineSpringBootApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(JasmineSpringBootApplication.class, args);
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, th, "start JasmineSpringBootApplication th");
        }
    }

}