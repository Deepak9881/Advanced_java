package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void addEmployee(Employee e);

	List<Employee> getAll();

	boolean deleteById(int empid);

	boolean modifyBySal(int empid, double sal);

	Employee displayById(int empid);

	List<Employee> sortBySal();

}
