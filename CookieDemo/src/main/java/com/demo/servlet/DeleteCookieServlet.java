package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCookieServlet
 */
@WebServlet("/delcookie")
public class DeleteCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nm=request.getParameter("nm");
		for (Cookie c:request.getCookies()) {
			if(c.getName().equals(nm)) {
				c.setMaxAge(0);
				response.addCookie(c);
			}
		}
		  RequestDispatcher rd=request.getRequestDispatcher("Cookiedisplay.jsp");
		  rd.forward(request, response);
	}
	

}
