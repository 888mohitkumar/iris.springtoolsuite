package com.spring.example.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("DEV")
public class DevProfile implements EnvBaseConfig {

	@Override
	public void setup() {
		System.out.println("DEV profile ::::::::::::::::::::");

	}

}
