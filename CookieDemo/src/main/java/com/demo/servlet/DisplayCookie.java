package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayCookie
 */
@WebServlet("/discookie")
public class DisplayCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	for(Cookie c:request.getCookies()) {
		out.println("Name: "+c.getName()+" "+"<br>Value: "+c.getValue());
	}
	RequestDispatcher rd=request.getRequestDispatcher("Cookiedisplay.jsp");
	rd.include(request, response);
	}

}
