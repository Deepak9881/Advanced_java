package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

private static Connection con;
	
	public static Connection getMyConnection() {
		if(con==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.150:3306/dac27";
				con=DriverManager.getConnection(url, "dac27", "welcome");
				return con;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return con;
	}
	
	public static void closeConnection() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	}

	
}
