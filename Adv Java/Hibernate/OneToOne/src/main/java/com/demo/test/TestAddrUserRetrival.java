package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
//import com.demo.model.MyUser;

public class TestAddrUserRetrival {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		Address a1 = s1.get(Address.class, 1);
//		MyUser u1 = s1.get(MyUser.class, 11);
		System.out.println(a1);
//		System.out.println(u1 + " " + u1.getAddr());
		tr.commit();
		s1.close();
		sf.close();
	}

}
