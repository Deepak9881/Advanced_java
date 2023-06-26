package com.demo.servlet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Employee;

/**
 * Servlet implementation class SaveSelectedEmployeeServlet
 */
@WebServlet("/emplist")
public class SaveSelectedEmployeeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] emplist=request.getParameterValues("check");
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		HttpSession session=request.getSession();
		Set<Employee> eset=(Set<Employee>)session.getAttribute("eset");
		if(eset==null) {
			eset=new HashSet<>();
		}
		for(String s:emplist)
		{
			String arr[]=s.split(":");
			eset.add(new Employee(Integer.parseInt(arr[0]),arr[1],deptno,Float.parseFloat(arr[2])));
		}
		session.setAttribute("eset", eset);
		
		RequestDispatcher rd=request.getRequestDispatcher("showselected.jsp");
		rd.forward(request, response);
		doGet(request, response);
	}

}
