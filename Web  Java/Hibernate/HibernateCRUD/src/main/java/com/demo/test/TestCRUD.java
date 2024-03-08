package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.service.*;
import com.demo.model.*;

public class TestCRUD {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		UserService uservice = new UserServiceImpl();
		do {
			System.out.println("1. Add New User\n2. Display All\n3. Diaplay By ID\n4. Delete By ID\n5. Update By ID\n6. Sort By ID\n7. Exit");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:		// Add
					 uservice.addNewUser();
					break;
				case 2:		// Display
					List<MyUser> ulist = uservice.DisplayAll();
					ulist.forEach(System.out::println);
					break;
				case 3:		// Display Id
					System.out.println("Enter user Id to search: ");
					int uid = sc.nextInt();
					MyUser u = uservice.getById(uid);
					if(u != null) {
						System.out.println(u);
					}
					else {
						System.out.println("User Not Found");
					}
					break;
				case 4:		// Delete Id
					System.out.println("Enter user Id to delete: ");
					int id = sc.nextInt();
					boolean status = uservice.deletebyId(id);
					if(status) {
						System.out.println("deleted successfully");
					}
					else {
						System.out.println("Not Found");
					}
					break;
				case 5:		// Update 
					break;
				case 6:		// Sort
					break;
				case 7:
					System.out.println("Thanks.....");
					break;
				default:
					System.out.println("Wrong Choice....");
			}
			
		} while (choice != 8);
	}

}
