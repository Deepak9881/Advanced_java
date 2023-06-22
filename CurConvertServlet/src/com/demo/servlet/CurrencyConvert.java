package com.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyConvert extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     String dollar=request.getParameter("dollar");                                                                                                                                                                                                                                      
     String inr=request.getParameter("inr");
     //System.out.println(inr);
     out.println("<h1>Currency Converter</h1>");
     out.println("<form action='convert' method='get'>");
     if(!dollar.equals("")) {
    	 float x=(float)(Integer.parseInt(dollar))*82;
    	 out.println("Dollar: <input type='text' name='dollar' id='doll' value='"+dollar+"' ><br>");
    	 out.println("INR: <input type='text' name='dollar' id='doll' value='"+x+"' ><br>");
    	 //out.println("<h3>"+x+"</h3>");
     }else {
    	 System.out.println("sgasrdg");
    	 float x=(float)(Integer.parseInt(inr))/82;
    	 // System.out.println(x);
    	 out.println("Dollar: <input type='text' name='dollar' id='doll' value='"+x+"' ><br>");
    	 out.println("INR: <input type='text' name='dollar' id='doll' value='"+inr+"' ><br>");
    	 //out.println("<h3>"+x+"</h3>");
    			 
     }
      out.println("<input type='submit' name='btn' value='Convert'>");
	}

}
