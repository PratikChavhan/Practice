package com.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.*;

public class PersonServiceImpl implements PersonService {

	
	Scanner sc = new Scanner(System.in);
	PersonDao pdao = new PersonDaoImpl();
	
	@Override
	public void addnewperson() {
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Number: ");
		String number = sc.next();
		
		Person p = new Person(id, name, number);
		// pdao.save(new Person(id, name, number));
		pdao.save(p);
	}

	@Override
	public List displayAll() {
		return pdao.findall();
	}

	@Override
	public Person displayByID(int id) {
		return pdao.findByID(id);
		
	}

	@Override
	public String deleteByID(int id1) {
		return pdao.removeByID(id1);
	}

	
	

}
