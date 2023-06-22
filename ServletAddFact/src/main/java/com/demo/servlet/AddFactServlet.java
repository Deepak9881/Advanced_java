package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddFactServlet
 */
@WebServlet("/AddFactServlet")
public class AddFactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("num1"));
		//System.out.println(num1);
		
		String choice=request.getParameter("btn");
		//System.out.println(choice);
		
		switch(choice) {
		case "addition":
			int num2=Integer.parseInt(request.getParameter("num2"));
			System.out.println(num2);
			
			out.println("<h3>Addition is:"+(num1+num2)+"</h3>");
			//System.out.println("<h3>Addition is:"+(num1+num2)+"</h3>");
			
			break;
			
		case "fact":
			int x=factorial(num1);
			out.println("<h3>Factorial of "+num1+" :"+x+" </h3>");
		    break;
		    
		    
		case "table":
			int num=num1;
			out.println("<table border='2' style='border-style:groove'>");
			for(int i=1;i<=10;i++) {
				out.println("<tr><td>"+(num1)+"*"+i+" = "+"</td><td>"+num*i+"</td></tr>");
			}
			out.println("</table>");
		}
		
		 
	}
     private int factorial(int num1) {
       int fact=1;
       for(int i=1; i<=num1;i++) {
    	   fact*=i;
       }
		return fact;
	}



}
