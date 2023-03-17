package com.natixis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class NatixisFirstJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(NatixisFirstJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("postconstruct.......");
	}
	public static void main(String[] args) {
		SpringApplication.run(NatixisFirstJenkinsApplication.class, args);
	}

}
