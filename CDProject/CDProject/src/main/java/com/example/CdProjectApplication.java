package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdProjectApplication.class, args);
		System.err.println("test");
	}
}
