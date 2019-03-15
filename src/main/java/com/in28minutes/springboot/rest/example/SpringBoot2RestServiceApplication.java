package com.in28minutes.springboot.rest.example;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.tomcat.jni.File;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.in28minutes.springboot.rest.example.student.FileUpLoadController;


@SpringBootApplication
@EnableScheduling
//@ComponentScan({"com.in28minutes.springboot.rest.example","controller"})
public class SpringBoot2RestServiceApplication implements ApplicationRunner {

	// Logging configuration
	private static final Logger logger = LogManager.getLogger(SpringBoot2RestServiceApplication.class);

	public static void main(String[] args) {
		new File(FileUpLoadController.uploadDirectory).mkdir();
		SpringApplication.run(SpringBoot2RestServiceApplication.class, args);
	}

	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }
}
