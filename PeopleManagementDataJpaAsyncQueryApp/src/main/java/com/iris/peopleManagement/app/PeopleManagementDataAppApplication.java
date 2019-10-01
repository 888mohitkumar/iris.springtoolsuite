package com.iris.peopleManagement.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.scheduling.annotation.EnableAsync;

import com.iris.peopleManagement.app.entities.Person;
import com.iris.peopleManagement.app.service.PeopleManagementService;

@SpringBootApplication
@EnableAsync
public class PeopleManagementDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int id=1;
		String newEmail="shriram@gmmail.com";
		updatePersonEmailById(id,newEmail);
		//CompletableFuture<Person> completableFuture=peopleManagementService.findByEmail("ram1@gmail.com");
		//Person person = completableFuture.get();
		//System.out.println(person);
	}

	private void updatePersonEmailById(int id, String newEmail) {
		peopleManagementService.updatePersonEmailById( id, newEmail);
	}

	
	




}
