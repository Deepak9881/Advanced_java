package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	//Declaring static connection for single object
	private static Connection con;
	
	//method to create and return Connection object
	public static Connection getConnection() {
		if(con==null) {
			try {
				//Driver Object registeration
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.150:3306/dac27?useSSL=false";
				con=DriverManager.getConnection(url,"dac27","welcome");
				System.out.println("Connection established");
				return con;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return con;
	}

}
