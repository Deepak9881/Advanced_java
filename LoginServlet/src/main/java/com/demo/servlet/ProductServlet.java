package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   ProductService ps=new ProductServiceImpl();
	   List<Product> plist=ps.getAllProducts();
	   
	   out.println("<table border='2'><tr><th>Product id</th><th>Product name</th><th>Product Quantity</th><th>Product Price</th><th>Action</th></tr>");
	   for(Product p:plist) {
		   out.println("<tr>"
		   		+ "<td>"+p.getPid()+"</td>"+
		   				"<td>"+p.getPname()+"</td>"+
		   						"<td>"+p.getQty()+"</td>"+
		   								"<td>"+p.getPrice()+"</td>"+
		   										"<td><a href='edit?Pid="+p.getPid()+"'>edit</a>/"
		   										+ "<a href='delete?Pid="+p.getPid()+"'>delete</a></td>"
		   		+ "</tr>");
		   
	   }

	  out.println(" </table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
