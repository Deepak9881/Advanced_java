package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Department;
import com.demo.beans.MyUser;
import com.demo.service.DeptService;
import com.demo.service.DeptServiceImpl;

/**
 * Servlet implementation class DepartmentListServer
 */
@WebServlet("/deptlist")
public class DepartmentListServer extends HttpServlet {
       
 
   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    HttpSession session =request.getSession();
	    MyUser u=(MyUser)session.getAttribute("user");
	    DeptService ds=new DeptServiceImpl();
	    if((u.getRole()).equals("admin")) {
	    	List<Department> dlist=ds.getAllDept();
	    	request.setAttribute("dlist", dlist);
	    	
	    	RequestDispatcher rd=request.getRequestDispatcher("Deptlist.jsp");
	    	rd.forward(request,response);
	    	}else {
	    		out.println("Invalid Credentials");
	    		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
	    		rd.include(request, response);
	    	}
	}

}
