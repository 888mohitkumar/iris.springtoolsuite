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
		//createPerson();
		//createPersons();
		//getAllPersons();
		//getPersonById();
		//deletePerson();
		//getAllPersons();
		updatePersonEmailById();
	}

	private void updatePersonEmailById() {
		peopleManagementService.updatePersonEmailById(1,"ram1@gmail.com");	
	}

	private void deletePerson() {
		Person p = new Person();
		p.setId(4);
		peopleManagementService.deletePerson(p);
		
	}

	private void getPersonById() {
		List<Integer> al = new ArrayList();
		al.add(4);
		al.add(9);
		al.add(1);
		Iterable<Person> personById = peopleManagementService.getPersonById(al);
		personById.forEach(System.out::println);
		
	}

	private void getAllPersons() {
		Iterable<Person> allPersons = peopleManagementService.getAllPersons();
		allPersons.forEach(System.out::println);
		
	}

	private void createPersons() {
		List<Person> al = new ArrayList();
		al.add(new Person("laxman", "shri", "laxman@gmail.com", new Date()));
		al.add(new Person("kush", "", "kush@gmail.com", new Date()));
		al.add(new Person("lov", "", "lov@gmail.com", new Date()));
		peopleManagementService.createPersons(al);
	}

	private void createPerson() {
		Person person1 = new Person("Ram", "Shri", "ram@gmail.com", new Date());
		Person personDb=peopleManagementService.createPerson(person1);
		System.out.println(personDb);
	}

}
