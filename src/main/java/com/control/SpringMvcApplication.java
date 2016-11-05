package com.control;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringMvcApplication {
public static HashMap<Long, Employee>	employee;

public static void main(String[] args) {
		System.out.println("Main Method");
		SpringApplication.run(SpringMvcApplication.class, args);
	
	}
}

