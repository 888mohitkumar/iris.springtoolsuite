package com.spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spring"})
public class SpringBootWhiteLabelErrorJsonResponseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWhiteLabelErrorJsonResponseApplication.class, args);
	}

}
