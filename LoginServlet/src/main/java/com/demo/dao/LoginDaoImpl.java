package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public class LoginDaoImpl  implements LoginDao{
	private static Connection con;
   private static PreparedStatement psget,psadd,psreg;
   static {
	   con=DBUtil.getConnection();
	   try {
		psget=con.prepareStatement("select * from user where uname=? and password=?");
		psadd=con.prepareStatement("insert into user values(?,?,?)");
		psreg=con.prepareStatement("insert into registeruser values(default,?,?,?,?,?,?)");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
   }
	@Override
	public MyUser getUser(MyUser myUser) {
		System.out.println("Inside Login Service");
		try {
			System.out.println(myUser.getPwd());
			psget.setString(1,myUser.getUname());
			psget.setString(2, myUser.getPwd());
			ResultSet rs=psget.executeQuery();
			rs.next();
			System.out.println("rs"+rs.getString(1));
			return (new MyUser(rs.getString(1),rs.getString(2),rs.getString(3)));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void addRegisterUser(RegisterUser ru, MyUser mu) {
	    try {
	    	System.out.println(ru.getName());
			psreg.setString(1, ru.getName());
			psreg.setString(2, ru.getAddress());
			psreg.setString(3, ru.getSkill());
			psreg.setString(4, ru.getGender());
			psreg.setString(5, ru.getCity());
			java.sql.Date dt=java.sql.Date.valueOf(ru.getLdt());
			psreg.setDate(6, dt);
			psadd.setString(1, mu.getUname());
			psadd.setString(2, mu.getPwd());
			psadd.setString(3, mu.getRole());
			psadd.executeUpdate();
			psreg.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   /* userid    | int          | NO   | PRI | NULL    | auto_increment |
	    | name      | varchar(20)  | YES  |     | NULL    |                |
	    | address   | varchar(80)  | YES  |     | NULL    |                |
	    | skill     | varchar(250) | YES  |     | NULL    |                |
	    | gender    | varchar(10)  | YES  |     | NULL    |                |
	    | city      | varchar(20)  | YES  |     | NULL    |                |
	    | birthdate |
	  //name, uname, address, skill, gen, city,dt
*/		
	}

}
