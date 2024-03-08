package com.demo.services;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {
	public List<Employee> findAllEmployees();

	public void addnewemp(Employee e1);

	public Employee getById(int empid);
}
