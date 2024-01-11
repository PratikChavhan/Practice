package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection conn;
	public static Connection getMyConnection() {
		if(conn == null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				// String url = "jdbc:mysql://192.168.10.150:3306/dac19?useSSL=false";
				// conn = DriverManager.getConnection(url,"dac19", "welcome");
				String url = "jdbc:mysql://localhost:3306/dbt?useSSL=false";
				conn = DriverManager.getConnection(url,"root", "root");
			} 
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public void closeMyConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
