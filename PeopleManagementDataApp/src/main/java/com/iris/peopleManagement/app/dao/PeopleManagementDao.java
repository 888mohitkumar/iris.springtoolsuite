package com.iris.peopleManagement.app.dao;
import  com.iris.peopleManagement.app.entities.*;
import org.springframework.data.repository.CrudRepository;


public interface  PeopleManagementDao extends CrudRepository<Person,Integer>{

}