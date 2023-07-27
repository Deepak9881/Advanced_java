package com.demo.PlannerRestWebService.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//annotation to create a table named Planner
@Entity
@Table(name="Planners")
public class Planner {
	//annotation for primary key
	@Id
	private int id;
	private	java.sql.Date date;
	private String taskinfo;
	private boolean isDone;
	
	//default constructor
	public Planner() {
		super();
	}

    //parameterized constructor
	public Planner(int id, Date date, String taskinfo, boolean isDone) {
		super();
		this.id = id;
		this.date = date;
		this.taskinfo = taskinfo;
		this.isDone = isDone;
	}
	

    //getter and setter methods for properties
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public java.sql.Date getDate() {
		return date;
	}


	public void setDate(java.sql.Date date) {
		this.date = date;
	}


	public String getTaskinfo() {
		return taskinfo;
	}


	public void setTaskinfo(String taskinfo) {
		this.taskinfo = taskinfo;
	}


	public boolean isDone() {
		return isDone;
	}


	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	//tostring method to print all the properties
	@Override
	public String toString() {
		return "Planner [id=" + id + ", date=" + date + ", taskinfo=" + taskinfo + ", isDone=" + isDone + "]";
	}


	

}
