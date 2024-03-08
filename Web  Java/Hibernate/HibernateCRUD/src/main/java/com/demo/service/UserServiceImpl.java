package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.*;

public class UserServiceImpl implements UserService {
	private UserDao udao;
	
	public UserServiceImpl() {
		udao = new UserDaoImpl();
	}
	// add new user
	public void addNewUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID: ");
		int uid = sc.nextInt();
		System.out.println("Enter User Name: ");
		String uname = sc.next();
		System.out.println("Enter Address ID: ");
		int addrid = sc.nextInt();
		System.out.println("Enter Street: ");
		String street = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		
		MyUser u = new MyUser(uid, uname, new Address(addrid, street, city));
		udao.save(u);
	}
	
	// display all
	public List<MyUser> DisplayAll() {
		return udao.findAll();
	}

	@Override
	public MyUser getById(int uid) {
		return udao.findById(uid);
	}

	@Override
	public boolean deletebyId(int uid) {
		return udao.removeById(uid);
	}
	
	
}
