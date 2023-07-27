package com.demo.service;

import com.demo.beans.Planner;
import com.demo.dao.PlannerDao;
import com.demo.dao.PlannerDaoImpl;

public class PlannerServiceImpl implements PlannerService {
	
	private PlannerDao pdao;
	
	public PlannerServiceImpl() {
		pdao=new PlannerDaoImpl();
	}

	@Override
	public void addPlan(Planner p) {
		pdao.addPlan(p);
		
	}

}
