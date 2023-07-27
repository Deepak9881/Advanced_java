package com.demo.PlannerRestWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.PlannerRestWebService.beans.Planner;

//Planner Dao interace extending the JPArepository for automatic retrieval data from databse
public interface PlannerDao extends JpaRepository<Planner, Integer>{

}
