package com.control;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class SpringMvcApplication {
public static HashMap<Long, Employee>	employee;

public static void main(String[] args) {
	
		SpringApplication.run(SpringMvcApplication.class, args);
		
	}
}

