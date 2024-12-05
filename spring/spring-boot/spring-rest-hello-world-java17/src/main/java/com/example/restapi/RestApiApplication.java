package com.example.restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@SpringBootApplication
public class RestApiApplication {

	// start everything
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
}
