package com.spring.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements ErrorController{
	
	@RequestMapping(value="/wecome", method=RequestMethod.GET)
	public String hello()
	{
		return "hello white label page";
	}
	
	//@RequestMapping(value ="/error")
	public String myErrorPage()
	{
		return "from error page";
	}

	@Override
	@RequestMapping(value ="/error")
	public String getErrorPath() {
		return "from error page";
	}
}
