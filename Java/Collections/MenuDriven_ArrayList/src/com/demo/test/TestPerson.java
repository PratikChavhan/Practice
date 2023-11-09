package com.demo.test;

import java.util.Scanner;
import com.demo.services.*;
import com.demo.beans.*;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("\n1. Add New Person\n2. display all\n3. display by id\n4. delete by id\n5. Exit\nEnter Choice: ");
			choice = sc.nextInt();
			PersonService ps = new PersonServiceImpl();
			switch(choice) {
			
			case 1: // add new person
				ps.addnewperson();
				break;
				
			case 2: // display all
				System.out.println(ps.displayAll());
				break;
			
			case 3: // display by id
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				System.out.println(ps.displayByID(id)); 
				break;
			
			case 4: // delete by id
				System.out.println("Enter ID: ");
				int id1 = sc.nextInt();
				String p = ps.deleteByID(id1);
				if (p!=null) {
					System.out.println("Id deleted Successfully"); 
				}
				else
					System.out.println("Id not Found.");
				break;
				
			case 5:
				sc.close();
				System.exit(0);
				break;
			}
			
		} while(choice != 5);
		
	}

}
