package com.DemoJenkin.demo.DemoJenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hello main method");
		SpringApplication.run(Application.class, args);
	}

}
