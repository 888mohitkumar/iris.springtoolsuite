package com.iris.peopleManagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.peopleManagement.app.dao.PeopleManagementDao;
import com.iris.peopleManagement.app.entities.Person;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;
	public  Person createPerson(Person person1) {
		return peopleManagementDao.save(person1);
	}
	public void createPersons(List<Person> al) {
		peopleManagementDao.save(al);
	}
	public Iterable<Person> getAllPersons() {
		Iterable<Person> findAll = peopleManagementDao.findAll();
		return findAll;
	}
	public Iterable<Person> getPersonById(List<Integer> al) {
		return peopleManagementDao.findAll(al);
	}
	
	public void deletePerson(Person p)
	{
		peopleManagementDao.delete(p);
	}
	public void updatePersonEmailById(int id, String string) {
		Person person = peopleManagementDao.findOne(id);
		if(person==null)
		{
			System.out.println("id is invalid");
		}
		else
		{
			person.setEmail(string);
			peopleManagementDao.save(person);
		}
	}
	public List<Person> getPersonInfoByLastName(String lastname) {
		return peopleManagementDao.getbyPersonLastName(lastname);
	}
	public List<Person> getPersonsInfoByFistNameAndemail(String firstname, String email) {
		//System.out.println(firstname);
		//System.out.println(email);
		return peopleManagementDao.getbyPersonFirstNameAndEmail(firstname,email);
	}

}