package com.niit.Dao;

import java.util.List;

import com.niit.Model.Person;

public interface PersonDao {


	List<Person> getAllPersons();
	void savePerson(Person person);
	void deletePerson(int id);
	}
	
	
