package com.iris.peopleManagement.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.dialect.pagination.FirstLimitHandler;

@Entity
@Table(name="person_table")
@DynamicUpdate
/*
 * @NamedQueries (value ={
 * 
 * @NamedQuery(name="Person.getbyPersonLastName",
 * query="select p from Person  p where p.lastName=?1"),
 * 
 * @NamedQuery(name="Person.getbyPersonFirstNameAndEmail",
 * query="select p from Person  p where p.firstName=?1 and p.email=?2") })
 */


@NamedNativeQueries(value = { @NamedNativeQuery(name = "Person.getbyPersonLastName", query = "select * from person_table where last_name=?1",resultClass=Person.class),
		                      @NamedNativeQuery(name = "Person.getbyPersonFirstNameAndEmail", query = "select * from person_table where first_name=?1 and email =?2",resultClass=Person.class)
							})
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="person_id")
	private int id;
	
	@Column(name="first_name", length =60, nullable=false)
	private String firstName;
	
	@Column(name="last_name", length =60, nullable=false)
	private String lastName;
	//findByLastName
	
	@Column(name="email", unique =true)
	private String email;
	
	@Column(name="creation_date")
	private Date creattionDate;


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getFirtstName() {
		return getFirtstName();
	}



	public void setFirtstName(String firtstName) {
		this.firstName = firtstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getCreattionDate() {
		return creattionDate;
	}



	public void setCreattionDate(Date creattionDate) {
		this.creattionDate = creattionDate;
	}


	public Person()
	{
		
	}

	public Person(String firtstName, String lastName, String email, Date creattionDate) {
		super();
		//this.id = id;
		this.firstName = firtstName;
		this.lastName = lastName;
		this.email = email;
		this.creattionDate = creattionDate;
	}
	
	@Override
	public String toString()
	{
		return "id :"+ id+" name:"+firstName;
	}
}
