package com.demo.test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestCreateStatement {

	public static void main(String[] args) {
		try {
			// Driver register
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/pdb?useSSL=false";
			// Connection
			Connection conn = DriverManager.getConnection(url, "root", "root");
			if(conn != null) {
				System.out.println("Connection Successful");
				// Create statement
				Statement st = conn.createStatement();
				ResultSet rs= st.executeQuery("Select * from products");
				while(rs.next()) {
					System.out.println("Pid: " + rs.getInt(1));
					System.out.println("Pname: " + rs.getString(2));
					System.out.println("rate: " + rs.getInt(1));
					System.out.println("=======================");
				}
				
				// adding element using create statement
				int pid = 110;
				String pname= "Sandwich";
				int rate = 60;
				String query = "insert into products values(" + pid + ", '" + pname + "', " + rate + ")";
				int i = st.executeUpdate(query);
				if(i > 0) {
					System.out.println("Record Added Successfully");
				}
			}
		} catch(SQLException e) {
			System.out.println("Error Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
