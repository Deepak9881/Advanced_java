package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class UpdateproductServlet
 */
@WebServlet("/UpdateproductServlet")
public class UpdateproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 int pid=Integer.parseInt(request.getParameter("pid"));
	 String pname=request.getParameter("pname");
	 int qty=Integer.parseInt(request.getParameter("qty"));
	 float pri=Float.parseFloat(request.getParameter("price"));
	 Product p=new Product(pid,pname,qty,pri);
	 ProductService ps=new ProductServiceImpl();
	 ps.updateById(p);
	 
	 RequestDispatcher rd=request.getRequestDispatcher("/product");
	 rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
