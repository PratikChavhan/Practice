package com.demo.service;

import java.util.List;

import com.demo.model.MyUser;

public interface UserService {
	public void addNewUser();

	public List<MyUser> DisplayAll();

	public MyUser getById(int uid);

	public boolean deletebyId(int uid);
}
