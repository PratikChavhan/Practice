package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class TestMyUserAddress {

	public static void main(String[] args) {
		Address add=new Address(1,"baner","pune");
		Address add1=new Address(2,"Deccan","pune");
		MyUser u1=new MyUser(10,"xxx",add);
		MyUser u2=new MyUser(11,"yyy",add1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		s1.save(add);
		s1.save(add1);
		s1.save(u1);
		s1.save(u2);
		tr.commit();
		sf.close();
	}

}
