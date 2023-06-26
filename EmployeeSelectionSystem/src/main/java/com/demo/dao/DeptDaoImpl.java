package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Department;

public class DeptDaoImpl implements DeptDao{
     private static Connection conn;
     private static PreparedStatement psget;
     
     static {
    	 conn=DBUtil.getMyConnection();
    	 try {
			psget=conn.prepareStatement("select deptno,dname from dept;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	@Override
	public List<Department> getAllDept() {
		List<Department>dlist=new ArrayList<>();
		try {
			ResultSet rs = psget.executeQuery();
			while(rs.next()) {
				dlist.add(new Department(rs.getInt(1),rs.getString(2)));
			}
			return dlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
