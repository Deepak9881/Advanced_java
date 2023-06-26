package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao{
	
	private static Connection con;
	private static PreparedStatement psget;
	
	static {
		con=DBUtil.getMyConnection();
		try {
			psget=con.prepareStatement("select * from user where uname=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MyUser getUser(MyUser myUser) {
		try {
			System.out.println("sadfasdf");
			psget.setString(1, myUser.getUname());
			ResultSet rs= psget.executeQuery();
			if(rs.next()) {
			MyUser u=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
			return u;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
