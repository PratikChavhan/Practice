package com.demo.services;

import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.*;

public class PersonServiceImpl implements PersonService {

	Scanner sc = new Scanner(System.in);
	PersonDao pdao = new PersonDaoImpl();
	
	@Override
	public void addNewPerson() {
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Number: ");
		String number = sc.next();
	
		Person p = new Person(id,name,number);
		pdao.save(p);
	}

	@Override
	public void displayall() {
		pdao.findall(); 
		
	}

}
