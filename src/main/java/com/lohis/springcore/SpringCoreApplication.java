package com.lohis.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SpringCoreApplication.class);
		app.run(args);
	}

}
