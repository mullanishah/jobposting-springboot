package com.shah.jobpost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	
public class JobpostingApplication {

	public static void main(String[] args) {
		//context-path can be set in application.properties or main()
		//System.setProperty("server.servlet.contextPath", "/jobposting");
		
		SpringApplication.run(JobpostingApplication.class, args);	
	}

}
