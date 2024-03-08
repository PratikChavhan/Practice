package com.org.demo.dao;

import com.org.demo.beans.Person;

public interface PersonDao {

    void save(Person p);

	Person[] findall();

	Person findByID(int id);

	String removeID(int i);
}
