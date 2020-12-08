package com.fileuploaddownload;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
@EnableConfigurationProperties(com.fileuploaddownload.beans.FileStorageProperties.class)
@ComponentScan(basePackages={"com.fileuploaddownload.beans","com.fileuploaddownload.controllers","com.fileuploaddownload.services"})
public class SpringBootAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		//SpringApplication application = new SpringApplication(SpringBootAppApplication.class);
		
		/*Properties properties = new Properties();
        properties.put("file.serverDir",args[0]);
        application.setDefaultProperties(properties);

        application.run(args);*/
        logger.info("Initialization step completed");

	}

}
