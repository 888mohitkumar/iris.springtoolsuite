package com.iris.peopleManagement.app.dao;
import  com.iris.peopleManagement.app.entities.*;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


/*{ @NamedNativeQuery(name = "Person.getbyPersonLastName", query = "select * from person_table where last_name=?1",resultClass=Person.class),
    @NamedNativeQuery(name = "Person.getbyPersonFirstNameAndEmail", query = "select * from person_table where first_name=?1 and email =?2",resultClass=Person.class)
	})
*/
public interface  PeopleManagementDao extends CrudRepository<Person,Integer>{
	///@Query(value ="select p from Person p where p.lastName=?1")
	@Query(value ="select * from person_table where last_name =?1",nativeQuery=true)
	List<Person> findByLastName(String lastname);

	//@Query(value ="select p from Person p where p.firstName=?1 and p.email =?2")
	@Query(value ="select * from person_table where first_name=?1 and email=?2", nativeQuery=true)
	List<Person> findByFirstNameAndEmail(String firstname, String email);
}
