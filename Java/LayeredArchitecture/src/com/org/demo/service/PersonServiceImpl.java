package com.org.demo.service;

import java.util.Scanner;
import com.org.demo.beans.Person;
import com.org.demo.dao.PersonDao;
import com.org.demo.dao.PersonDaoImpl;

public class PersonServiceImpl implements PersonService {

    Scanner sc = new Scanner(System.in);
    PersonDao pdao= new PersonDaoImpl();
    
    @Override
    public void addNewPerson(){
        System.out.println("Enter id: ");
        int id  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Number: ");
        String number = sc.nextLine();
        Person p = new Person(id, name, number);
        // Store this object in DAO database.
        pdao.save(p);
        System.out.println("Person added succesfully...!!!");
    }

	@Override
	public Person[] displayall() {
		
		return pdao.findall();
	}

	@Override
	public Person displayByID(int id) {
		return pdao.findByID(id);
	}

	@Override
	public String deleteByID(int i) {
		return pdao.removeID(i);
	}
}
