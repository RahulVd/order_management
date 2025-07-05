package com.grocery.order_management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, args);

	}

	@Bean
	public CommandLineRunner printBeans(ApplicationContext ctx) {
		return args -> {
			System.out.println("==== Registered Controllers ====");
			for (String name : ctx.getBeanDefinitionNames()) {
				if (name.toLowerCase().contains("controller")) {
					System.out.println(name);
				}
			}
		};
	}

}
