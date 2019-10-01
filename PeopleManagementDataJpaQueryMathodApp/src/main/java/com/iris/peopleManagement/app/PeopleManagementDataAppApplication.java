package com.iris.peopleManagement.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iris.peopleManagement.app.entities.Person;
import com.iris.peopleManagement.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getPersonInfoByLastName();
		//getPersonsInfoByFistNameAndemail();
	}

	private void getPersonsInfoByFistNameAndemail() {
		List<Person> personList = peopleManagementService.getPersonsInfoByFistNameAndemail("Ram","ram1@gmail.com");
		personList.forEach(System.out::println);				
		
	}

	private void getPersonInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonInfoByLastName("shri");
		personList.forEach(System.out::println);	
	}



}