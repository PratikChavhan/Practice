package com.demo.dao;

import java.util.List;

import com.demo.model.MyUser;

public interface UserDao {

	public void save(MyUser u);

	public List<MyUser> findAll();

	public MyUser findById(int uid);

	public boolean removeById(int uid);

}
