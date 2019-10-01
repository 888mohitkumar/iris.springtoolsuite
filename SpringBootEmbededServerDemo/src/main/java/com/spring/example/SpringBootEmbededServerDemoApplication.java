package com.spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootEmbededServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmbededServerDemoApplication.class, args);
	}

}

@RestController
class MyRestContoller
{
	@GetMapping("/")
	public String welcome()
	{
		return "SpringBootEmbededServerDemoApplication jetty";
	}
}