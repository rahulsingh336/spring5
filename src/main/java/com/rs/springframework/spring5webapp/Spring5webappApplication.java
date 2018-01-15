package com.rs.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	@PostConstruct
	void init(){
		{
			System.out.println("version: " + SpringVersion.getVersion());
		}
	}
}
