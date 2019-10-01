package com.spring.example.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("QA")
public class QAProfile implements EnvBaseConfig {

	@Override
	public void setup() {
		System.out.println("QA profile ::::::::::::::::::::");

	}

}
