package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static Connection conn;
	private static PreparedStatement psget;
	
	static {
		conn=DBUtil.getMyConnection();
		try {
			psget=conn.prepareStatement("select empno,ename,deptno,sal from emp where deptno=?;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public List<Employee> getEmployees(int deptno) {
		List<Employee>elist=new ArrayList<>();
		try {
			psget.setInt(1,deptno);
			ResultSet rs=psget.executeQuery();
			while(rs.next()) {
				elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
