package com.demo.beans;

import java.sql.Date;
import java.time.LocalDate;

//Bean class to operate on Database relation Planner
public class Planner {
	//Properties of Planner Class
	private int id;
	private	java.sql.Date date;
	private String taskinfo;
	private boolean isDone;
	
	
	//Default Constructor
	public Planner() {
		super();
	}

	//Parameterized Constructor
	public Planner(int id, Date date, String taskinfo, boolean isDone) {
		super();
		this.id = id;
		this.date = date;
		this.taskinfo = taskinfo;
		this.isDone = isDone;
	}

	//Constructor with  two arguments for creating object in servlet
	public Planner(Date date, String taskinfo) {
		super();
		this.date = date;
		this.taskinfo = taskinfo;
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

	//ToString method to print all the properties
	@Override
	public String toString() {
		return "Planner [id=" + id + ", date=" + date + ", taskinfo=" + taskinfo + ", isDone=" + isDone + "]";
	}


	

}
