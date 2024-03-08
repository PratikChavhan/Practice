package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Person;

public class PersonDaoImpl implements PersonDao{

	static ArrayList<Person> parr = new ArrayList<>();
	
	static {
		parr.add(new Person(1,"Rahul", "16486464645"));
		parr.add(new Person(2,"Harsh", "86666459099"));
		parr.add(new Person(3,"Mohit", "44486964909"));
		parr.add(new Person(4,"Nakul", "16668769009"));
		parr.add(new Person(5,"Samarth", "3455464454"));
	}
	
	@Override
	public void save(Person p) {
		parr.add(p);
	}

	@Override
	public List findall() {
		return parr;
	}

	@Override
	public Person findByID(int id) {
		for(Person p: parr) {
			if (id == p.getPid()) {
				return p;
			}
		}
		return null;
		// for (int i = 0; i < parr.size();i++) {}
	}

	@Override
	public String removeByID(int id1) {
		for(Person p : parr) {
			if(id1 == p.getPid()) {
				parr.remove(p);
				return "Id Deleted Succesfully.";
			}
		}
		return null;
	}
	
	

}
