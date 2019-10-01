package com.iris.peopleManagement.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

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

		List<Person> list = peopleManagementService.findByLastName("Shri",new PageRequest(1, 1, Direction.DESC, "firstName"));
		list.forEach(System.out::println);
	}





}
