package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	List<Employee> displayAll();

	boolean deleteEmpoyee(int empid);

	boolean modifysal(int empid, double sal);

	Employee displayById(int empid);

	List<Employee> sortBySal();

}
