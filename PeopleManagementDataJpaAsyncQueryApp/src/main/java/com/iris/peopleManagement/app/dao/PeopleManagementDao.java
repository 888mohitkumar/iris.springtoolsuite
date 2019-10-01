package com.iris.peopleManagement.app.dao;
import  com.iris.peopleManagement.app.entities.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;


public interface  PeopleManagementDao extends CrudRepository<Person,Integer>{

	@Async //To execute method Async
	CompletableFuture<Person> findByEmail(String email);

	@Transactional
	@Modifying
	@Query(value="update Person p set email=:newEmail where id =:id")
	void updatePersonEmailById(@Param("id")int id, @Param("newEmail") String newEmail);



}