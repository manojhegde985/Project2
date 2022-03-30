package com.example.project1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients
@EnableConfigServer
@ComponentScan(basePackages={" com.example.usermanagement.IProject2Service"})
public class Project2Application {

	private static final Logger logger = LoggerFactory.getLogger(Project2Application.class);
	public static void main(String[] args) {
		logger.info("this is a customer management spring boot application ");
	     
	
		SpringApplication.run(Project2Application.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate()
	{
	return new RestTemplate();
	}


}
