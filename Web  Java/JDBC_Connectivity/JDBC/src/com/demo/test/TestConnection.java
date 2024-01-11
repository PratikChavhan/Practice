package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestConnection {
	
	public static void main(String[] args) {
		try {
			// 1. Register the Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			// 2. Get connection
			String url ="jdbc:mysql://localhost:3306/pdb?useSSL=false";
			Connection conn = DriverManager.getConnection(url,"root", "root");
			if(conn!=null) {
				System.out.println("Connection Successful");
			}
		} catch (SQLException e) {
			System.out.println("Error occured" + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
