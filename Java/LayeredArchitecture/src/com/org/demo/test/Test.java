package com.org.demo.test;

import java.util.Scanner;
import com.org.demo.beans.*;
import com.org.demo.service.*;
import com.org.demo.dao.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("\n1. Add New Person\n2. display all\n3. display by id\n4. delete by id\n5. Exit\nEnter Choice: ");
			choice = sc.nextInt();
			PersonService ps = new PersonServiceImpl();
			switch(choice){
				case 1:
					// add new person
					ps.addNewPerson();
					break;
					
				case 2:
					// display all
					Person[] arr = ps.displayall();
					for(int i=0; i<arr.length; i++) {
						if (arr[i] != null) {
							System.out.println(arr[i]);
						}
						else
							break;
					}
					break;
					
				case 3:
					// display by id
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					Person p = ps.displayByID(id);
					if (p != null) {
						System.out.println(p);
					}
					else
						System.out.println("Id not found");
					break;
					
				case 4:
					// delete by id
					System.out.println("Enter ID: ");
					int i = sc.nextInt();
					String p1 = ps.deleteByID(i);
					if (p1 != null) {
						System.out.println(p1);
					}
					else
						System.out.println("Id not found");
						
					break;
				case 5:
					// exit
					System.out.println("Byee....!!!!");
					System.exit(0);
					break;
			}



		} while(choice != 5);


	}

}
