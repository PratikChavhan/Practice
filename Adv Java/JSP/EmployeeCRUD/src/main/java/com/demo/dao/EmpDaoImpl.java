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
	static PreparedStatement selemp, insemp, selById;
	static {
		
		try {
			conn = DBUtil.getMyConnection();
			selemp = conn.prepareStatement("select * from employee");
			insemp = conn.prepareStatement("insert into employee values(?, ?, ?)");
			selById = conn.prepareStatement("select * from employee where empno = ?");
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

	@Override
	public void insertnewemp(Employee e1) {
		try {
			insemp.setInt(1,e1.getEmpno());
			insemp.setString(2,e1.getEname());
			insemp.setInt(3,e1.getSal());
			insemp.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee findById(int empid) {
		try {
			selById.setInt(1, empid);
			ResultSet rs = selById.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	

	

	
}
