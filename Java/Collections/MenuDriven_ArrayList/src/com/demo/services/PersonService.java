package com.demo.services;

import java.util.List;

import com.demo.beans.Person;

public interface PersonService {
	void addnewperson();

	List displayAll();

	Person displayByID(int id);

	String deleteByID(int id1);
}
