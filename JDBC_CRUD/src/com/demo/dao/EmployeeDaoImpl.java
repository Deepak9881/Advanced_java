package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Connection con;
	private static PreparedStatement psadd,psget,psdel,psmod,psdis,pssort;
	
	static {
		con=ConnectionTest.getConnection();
		try {
			psadd=con.prepareStatement("insert into emp (empno, ename,sal,deptno)values (?,?,?,40)");
			psget=con.prepareStatement("select empno,ename,sal from emp");
			psdel=con.prepareStatement("delete from emp where empno=?");
			psmod=con.prepareStatement("update emp set sal=? where empno=?");
			psdis=con.prepareStatement("select empno, ename,sal from emp where empno=?");
			pssort=con.prepareStatement("select empno, ename, sal from emp order by sal");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addEmployee(Employee e) {
		try {
			psadd.setInt(1, e.getEmpid());
			psadd.setString(2, e.getEname());
			psadd.setDouble(3, e.getSal());
			psadd.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> lst=new ArrayList<>();
		try {
			ResultSet rs=psget.executeQuery();
			while(rs.next()) {
				int empid=rs.getInt(1);
				System.out.println(empid);
				String ename=rs.getString(2);
				System.out.println(ename);
				double sal=rs.getDouble(3);
				System.out.println(sal);
				lst.add(new Employee(empid,ename,sal));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public boolean deleteById(int empid) {
		
		int val = 0;
		try {
			psdel.setInt(1,empid);
			val = psdel.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(val>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyBySal(int empid, double sal) {
         try {
			psmod.setInt(2,empid);
			psmod.setDouble(1, sal);
			int val=psmod.executeUpdate();
			if(val>0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee displayById(int empid) {
		try {
			psdis.setInt(1,empid);
			ResultSet rs=psdis.executeQuery();
			while(rs.next()){
				 empid=rs.getInt(1);
				 String ename=rs.getString(2);
				 double sal=rs.getDouble(3);
                 Employee e=new Employee(empid,ename,sal);			
				return e;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> sortBySal() {
		List<Employee>lst=new ArrayList<>();
		try {
			ResultSet rs=pssort.executeQuery();
			while(rs.next()) {
				int empid=rs.getInt(1);
				String ename=rs.getString(2);
				double sal=rs.getDouble(3);
				Employee e=new Employee(empid, ename, sal);
				lst.add(e);
			}
			return lst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
