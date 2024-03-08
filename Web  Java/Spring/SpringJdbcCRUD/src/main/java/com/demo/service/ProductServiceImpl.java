package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.*;
import com.demo.dao.*;
import java.util.Scanner;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pdao;
	
	public int addnewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid: ");
		int pid=sc.nextInt();
		System.out.println("Enter pname: ");
		String pname=sc.next();
		System.out.println("Enter qty: ");
		int qty=sc.nextInt();
		System.out.println("Enter price: ");
		double price=sc.nextDouble();
		Product p=new Product(pid,pname,qty,price);
		return pdao.save(p);
	}

}
