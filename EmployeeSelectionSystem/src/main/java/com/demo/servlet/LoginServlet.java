package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		
		String password=request.getParameter("pwd");
		LoginService ls=new LoginServiceImpl();
		MyUser u=ls.getUser(new MyUser(uname,password,null));
	
		if(u!=null) {
			if(u.getRole().equals("admin")) {
				
				HttpSession session=request.getSession();
				session.setAttribute("user", u);
				RequestDispatcher rd=request.getRequestDispatcher("/deptlist");
				rd.forward(request,response);
			}
			
		}
		else {
		out.println("Invalid Credentials");
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.include(request, response);
	}
	}

}
