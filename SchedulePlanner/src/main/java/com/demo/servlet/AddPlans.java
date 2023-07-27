package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Planner;
import com.demo.service.PlannerService;
import com.demo.service.PlannerServiceImpl;

//AddPlans servlet to accpet the addplan request
@WebServlet("/addplan")
public class AddPlans extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	//doPost mehod to accpet and process the request
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Service class object to call the method
		PlannerService ps=new PlannerServiceImpl();
		//setting the content type of out response
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//accepting the input form values from from
		String date=request.getParameter("date");
		//conversion of date to dql date
		java.sql.Date ddt=Date.valueOf(date);
		String desc=request.getParameter("desc");
        Planner p=new Planner(ddt,desc);
		ps.addPlan(p);
		
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.include(request, response);

		
	}

}
