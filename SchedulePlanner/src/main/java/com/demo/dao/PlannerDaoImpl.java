package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Planner;

public class PlannerDaoImpl implements PlannerDao{

	
	private static Connection con=null;
	private static PreparedStatement psadd; 
	
	static {
		con=DBUtil.getConnection();
		try {
			psadd=con.prepareStatement("insert into Planner(date,info) values(?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addPlan(Planner p) {
		
		try {
			psadd.setDate(1, p.getDate());
			psadd.setString(2,p.getTaskinfo());
			psadd.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
