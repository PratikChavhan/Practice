package com.demo.services;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService{
	private EmpDao edao;
	
	public EmpServiceImpl() {
		super();
		this.edao = new EmpDaoImpl();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return edao.getAllEmployees();
	}

	@Override
	public void addnewemp(Employee e1) {
		edao.insertnewemp(e1);
		
	}

}
