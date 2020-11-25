package com.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudForCountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudForCountriesApplication.class, args);
		System.out.println("welcome to country crud");
	}

}
