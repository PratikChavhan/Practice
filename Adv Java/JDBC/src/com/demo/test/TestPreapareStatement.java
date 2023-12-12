package com.demo.test;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreapareStatement {

	public static void main(String[] args) {
		try {
			// Register
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/pdb?useSSL=false";
			// connection
			Connection conn = DriverManager.getConnection(url, "root", "root");
			// statement
			PreparedStatement st = conn.prepareStatement("select * from products");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println("Pid: " + rs.getInt(1));
				System.out.println("Pname: " + rs.getString(2));
				System.out.println("rate: " + rs.getInt(1));
				System.out.println("=======================");
			}
			
			// adding element using create statement
			int pid = 111;
			String pname= "cookies";
			int rate = 30;
			
			PreparedStatement st1= conn.prepareStatement("insert into products values(?,?,?)");
			st1.setInt(1, pid);
			st1.setString(2, pname);
			st1.setInt(3, rate);
			
			int n = st1.executeUpdate();
			if(n>0) {
		    	System.out.println("added sucessfully");
		    }
		}catch(SQLException e) {
			System.out.println("Error Message: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
