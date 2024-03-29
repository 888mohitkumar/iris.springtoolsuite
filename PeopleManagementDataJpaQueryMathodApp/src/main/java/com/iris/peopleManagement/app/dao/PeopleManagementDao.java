package com.iris.peopleManagement.app.dao;
import  com.iris.peopleManagement.app.entities.*;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface  PeopleManagementDao extends CrudRepository<Person,Integer>{
	List<Person> findByLastName(String lastname);

	List<Person> findByFirstNameAndEmail(String firstname, String email);
}
