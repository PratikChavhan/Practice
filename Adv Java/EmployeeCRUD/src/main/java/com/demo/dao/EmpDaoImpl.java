package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDaoImpl implements EmpDao{
	static Connection conn;
	static PreparedStatement selemp;
	static {
		
		try {
			conn = DBUtil.getMyConnection();
			selemp = conn.prepareStatement("select * from employee");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> lst=new ArrayList<>();
		ResultSet rs;
		try {
			rs = selemp.executeQuery();
		
		while(rs.next()) {
			Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
			lst.add(e);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
	
	

	

	
}
