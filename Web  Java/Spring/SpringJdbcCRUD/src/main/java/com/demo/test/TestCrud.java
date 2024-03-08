package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.service.*;
import java.util.Scanner;

public class TestCrud {

	public static void main(String[] args) {
		// creating application context
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		// creating bean instance
		ProductService pservice=(ProductService)ctx.getBean("productServiceImpl");
		
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. add new product\n 2. delete product\n 3. modify product");
			System.out.println("4. display all\n5.display by id\n6. display by qty\n7.exit");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: 	// add new product
					int n = pservice.addnewProduct();
				case 2:		// delete product
				case 3: 	// modify product
				case 4: 	// display all product
				case 5: 	// display by id
				case 6: 	// display by qty
				case 7:		// exit
			}
		} while(choice != 0);
	}

}
