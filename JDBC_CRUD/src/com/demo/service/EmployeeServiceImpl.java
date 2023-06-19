package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl  implements EmployeeService{
	
	private EmployeeDao edao;
	
	

	public EmployeeServiceImpl() {
		super();
		this.edao =new EmployeeDaoImpl();
	}



	@Override
	public void addnewEmployee() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id= sc.nextInt();
		System.out.println("Enter Employee name");
		String ename=sc.next();
		System.out.println("Enter the salary");
		double sal=sc.nextDouble();
		Employee e=new Employee(id,ename,sal);
		edao.addEmployee(e);
		
	}



	@Override
	public List<Employee> displayAll() {
		return edao.getAll();
	}



	@Override
	public boolean deleteEmpoyee(int empid) {
		
		return edao.deleteById(empid);
	}



	@Override
	public boolean modifysal(int empid, double sal) {
		return edao.modifyBySal(empid,sal);
	}



	@Override
	public Employee displayById(int empid) {
		
		return edao.displayById(empid);
	}



	@Override
	public List<Employee> sortBySal() {
		
		return edao.sortBySal();
	}



	
}
