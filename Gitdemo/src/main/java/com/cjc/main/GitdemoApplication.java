package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public static void main(String[] args) {
		System.out.println("This is demo of git");
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
