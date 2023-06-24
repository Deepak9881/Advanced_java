package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;


public class LoginServlet extends HttpServlet {

       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("Ashish");
		
		String uname=request.getParameter("uname");
		String password=request.getParameter("pwd");
		LoginService ls=new LoginServiceImpl();
		MyUser user=new MyUser(uname,password,"admin");
	    MyUser u=ls.getUser(user);
	    
	    if(u==null){
	    	out.println("<h3>Invalid credentials</h3>");
	    	RequestDispatcher rd=request.getRequestDispatcher("Login.html");
	    	rd.include(request, response);
	    }else {
	    	RequestDispatcher rd=request.getRequestDispatcher("/product");
	    	rd.forward(request, response);
	    }
		
	}

	

}
