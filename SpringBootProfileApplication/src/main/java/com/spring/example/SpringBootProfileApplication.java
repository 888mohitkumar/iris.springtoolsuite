package com.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.example.config.EnvBaseConfig;

@SpringBootApplication
public class SpringBootProfileApplication implements CommandLineRunner{

	@Autowired
	private EnvBaseConfig envBaseConfig;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("env base config");
		envBaseConfig.setup();
	}

}
