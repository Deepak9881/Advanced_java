package com.demo.service;

import java.util.List;

import com.demo.beans.Department;
import com.demo.dao.DeptDao;
import com.demo.dao.DeptDaoImpl;

public class DeptServiceImpl implements DeptService{
     private DeptDao ddao;

	public DeptServiceImpl() {
		
		this.ddao = new DeptDaoImpl();
	}

	@Override
	public List<Department> getAllDept() {
		return ddao.getAllDept();
	}
     
}
