package com.lohis.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("SpringCoreApplication is starting");
		SpringApplication app = new SpringApplication(SpringCoreApplication.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beans = applicationContext.getBeanDefinitionNames();
		for(String bean : beans) {
			System.out.println("Bean name : " + bean);

//            Object object = applicationContext.getBean(bean);
//            System.out.println("Bean object : " + object);
		}
			System.out.println("End of SpringCoreApplication");
	}
}
