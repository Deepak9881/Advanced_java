package com.demo.PlannerRestWebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.PlannerRestWebService.beans.Planner;
import com.demo.PlannerRestWebService.service.PlannerService;

//Restcontroller to get mapping 

@RestController
//request mapping for common url
@RequestMapping("/plan")
public class PlannerController {
	//autowiring the object of PlannerService
  @Autowired
  private PlannerService plannerService;
  
  
  //RequestMapping for the url allplans and return the list of Employees
  @GetMapping("/allplans")
  public ResponseEntity<List<Planner>> getAllPlans(){
	  //calling the getAllPlans() method from service
	  List<Planner> planlist=plannerService.getAllPlans();
	  //return the responseentity object with list of plans
	  return ResponseEntity.ok(planlist);
	  
  }
  
}
