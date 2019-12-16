package com.pengesoft.fwzlxt;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FWZLXTApplication {

    private static Logger logger = Logger.getLogger(FWZLXTApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FWZLXTApplication.class, args);
        logger.info(FWZLXTApplication.class.getSimpleName() + " start success!");
    }
}
