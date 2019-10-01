package com.iris.peopleManagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.iris.peopleManagement.app.dao.PeopleManagementDao;
import com.iris.peopleManagement.app.entities.Person;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> findByLastName(String lastname, PageRequest pageRequest) {
		return peopleManagementDao.findByLastName( lastname, pageRequest);
	}
	
}