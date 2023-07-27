package com.demo.PlannerRestWebService.service;

import java.util.List;

import com.demo.PlannerRestWebService.beans.Planner;

//PlannerService interface to write the methods that to be implemented by PlannerServiceImpl class
public interface PlannerService {

	List<Planner> getAllPlans();

}
