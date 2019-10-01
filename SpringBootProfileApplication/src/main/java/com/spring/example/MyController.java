package com.spring.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Value("${name}")
	String name ;
	
	@RequestMapping(value="/hello")
	public String hello()
	{
		return "spring boot profile application:::"+name;
	}
	
}