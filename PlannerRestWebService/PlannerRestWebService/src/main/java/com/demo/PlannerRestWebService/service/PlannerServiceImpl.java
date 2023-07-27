package com.demo.PlannerRestWebService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.PlannerRestWebService.beans.Planner;
import com.demo.PlannerRestWebService.dao.PlannerDao;

//annotation for service class component
//PlannerServiceImpl class implementing methods from PlannerService Interface
@Service
public class PlannerServiceImpl implements PlannerService{
	//autowiring object of dao
	@Autowired
	private PlannerDao plannerDao;
	
	
    //Implementing method from Interface
	@Override
	public List<Planner> getAllPlans() {
	    //List of planner to accept the list returned by JPARepository
		List<Planner> plist=plannerDao.findAll();
		System.out.println(plist);
		return plist;
	}
}
