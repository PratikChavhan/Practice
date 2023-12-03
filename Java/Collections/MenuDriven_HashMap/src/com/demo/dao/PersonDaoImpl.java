package com.demo.dao;

import java.util.HashMap;
import java.util.Map;

import com.demo.beans.*;

public class PersonDaoImpl implements PersonDao {
	
	Map<Integer, Person> hm = new HashMap<>();
	
	@Override
	public void save(Person p) {
		hm.put(p.getID(), p);
		
	}

	@Override
	public void findall() {
		for(Map.Entry<Integer,Person> e : hm.entrySet()) {
			System.out.println(e.getValue()); 
		}
		// return null;
	}
	
}
