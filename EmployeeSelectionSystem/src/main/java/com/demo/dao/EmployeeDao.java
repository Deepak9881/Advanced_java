package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	List<Employee> getEmployees(int deptno);

}
