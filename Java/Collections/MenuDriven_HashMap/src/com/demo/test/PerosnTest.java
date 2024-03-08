package com.demo.test;

import com.demo.beans.Person;
import com.demo.services.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PerosnTest {

	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add new Person\n2. Display all\n3. Display by ID\n4. Delete by ID\n5. Exit\nEnter Choice: ");
			choice = sc.nextInt();
			PersonService ps = new PersonServiceImpl();
			switch(choice) {
				case 1: // adding new person
					ps.addNewPerson();
					break;
				case 2: // display all
					// Person p = ps.displayall(); 
					ps.displayall();
					break;
				case 3: // display by id
					int id;
					// ps.displayByID(id);
					break;
				case 4: // delete by id
					int i;
					// ps.deleteByID(i);
					break;
				case 5: // exit
					System.out.println("Thanks for visiting...!!!");
					System.exit(0);
					break;
			}
		} while(choice != 5);
	}

}
