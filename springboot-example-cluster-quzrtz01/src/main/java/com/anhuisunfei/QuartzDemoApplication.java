package com.anhuisunfei;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 *
 * @author sunf
 * @version 1.0
 * @date 2020/12/23 16:33
 */
@SpringBootApplication
public class QuartzDemoApplication {
    private static final Logger logger = LogManager.getLogger(QuartzDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(QuartzDemoApplication.class, args);
    }
}
