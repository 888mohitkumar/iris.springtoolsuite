package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.modal.ErrorJson;

@RestController
public class Customcontroller {

	private static final String PATH ="/error";
	
	@Value("${debug}")
	private boolean debug;
	
	
	//@Autowired
	//private ErrorAttributes errorAttributes;
	
	
	@RequestMapping(value= "/error")
	public String hello()
	{
		return "";
	}
	
	
	@RequestMapping(value= "/error")
	ErrorJson error()
	{
		return new ErrorJson(404,"path not found");
	}
}
