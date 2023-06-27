package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieHomeServlet
 */
@WebServlet("/cookie")
public class CookieHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	   String btn=request.getParameter("btn");
	   System.out.println(btn);
	   RequestDispatcher rd=null;
	   switch(btn) {
	   case "add":
		   System.out.println("inside add");
		   rd=request.getRequestDispatcher("addcookie");
		   break;
	   case "dis":
		   System.out.println("inside dis");
		    rd=request.getRequestDispatcher("discookie");
		   break;
	   case "del":
		   System.out.println("inside del");
		    rd=request.getRequestDispatcher("delcookie");
		   break;
	   }
	   rd.forward(request, response);
	}

	
	

}
