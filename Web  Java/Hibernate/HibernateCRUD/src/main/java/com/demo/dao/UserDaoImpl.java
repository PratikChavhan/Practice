package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.MyUser;

public class UserDaoImpl implements UserDao {
	static SessionFactory sf;
	static {
		sf = HibernateUtil.getMySessionFactory();
	}
	public void save(MyUser u) {
		Session session = sf.openSession();
		Transaction  tr = session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
	}
	public List<MyUser> findAll() {
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query = session.createQuery("from MyUser");
		List<MyUser> ulist = query.list();
		tr.commit();
		session.close();
		return ulist;
	}
	@Override
	public MyUser findById(int uid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		MyUser u = session.get(MyUser.class, uid);
		session.close();
		return u;
	}
	@Override
	public boolean removeById(int uid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		MyUser u = session.get(MyUser.class, uid);
		if(u != null) {
			session.delete(u);
			tr.commit();
			session.close();
			return true;
		}
		else {
			session.close();
			return false;
		}
	}

}
