package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		
		this.edao =new EmployeeDaoImpl();
	}

	@Override
	public List<Employee> getEmployees(int deptno) {
		
		return edao.getEmployees(deptno);
	}
	

}
