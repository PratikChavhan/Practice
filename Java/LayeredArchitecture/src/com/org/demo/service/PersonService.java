package com.org.demo.service;

import com.org.demo.beans.Person;

public interface PersonService {
    
	void addNewPerson();
	
	Person[] displayall();

	Person displayByID(int id);

	String deleteByID(int i);
}
