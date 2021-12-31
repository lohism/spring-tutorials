package com.lohis.springcore.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyLogger implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogger.class);

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is being executed from MyLogger");
        LOGGER.error("This is error level message");
        LOGGER.warn("This is warn level message");
        LOGGER.info("This is info level message");
        LOGGER.debug("This is debug level message");
        LOGGER.trace("This is trace level message");
    }
}
