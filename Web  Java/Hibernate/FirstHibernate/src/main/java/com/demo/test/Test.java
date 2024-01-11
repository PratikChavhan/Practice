package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;


public class Test {

	public static void main(String[] args) {
		User u1 = new User(100,"aaaa");
		User2 u2 = new User2(30,"bbbb");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(u2);
		s1.save(u1);
		tr.commit();
		s1.close();
	}

}
