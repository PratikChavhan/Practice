package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {
	public List<Employee> getAllEmployees();

	public void insertnewemp(Employee e1);
}
