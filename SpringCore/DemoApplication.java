package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {

		  ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		UserValidationInterface  g = (UserValidationInterface) ctx.getBean("defaultUserValidation");
		
	
		
		boolean f= g.validateUser("Revathi","rev");
		System.out.println(g.validateUser("Revathi", "rev"));
		if (f==true) {
			System.out.println("Login Sucessful");
		}
		else System.out.println("Login UnSucessful");
		
	}

}
