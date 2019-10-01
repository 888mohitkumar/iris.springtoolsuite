package com.iris.peopleManagement.app.dao;
import  com.iris.peopleManagement.app.entities.*;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


/*{ @NamedNativeQuery(name = "Person.getbyPersonLastName", query = "select * from person_table where last_name=?1",resultClass=Person.class),
    @NamedNativeQuery(name = "Person.getbyPersonFirstNameAndEmail", query = "select * from person_table where first_name=?1 and email =?2",resultClass=Person.class)
	})
*/
public interface  PeopleManagementDao extends CrudRepository<Person,Integer>{

	List<Person> findByLastName(String lastname, Pageable pageRequest);

}