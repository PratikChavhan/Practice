package com.demo.dao;

import java.util.List;

import com.demo.beans.Person;

public interface PersonDao {
	void save(Person p);

	List findall();

	Person findByID(int id);

	String removeByID(int id1);
}
