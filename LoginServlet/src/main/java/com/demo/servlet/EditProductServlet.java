package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EditProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    int pid=Integer.parseInt(request.getParameter("Pid"));
	    ProductService ps=new ProductServiceImpl();
	     Product p= ps.getById(pid);
	     
	     out.println("<form action='/LoginServlet/update' method='get'>");
	     out.println("Product id : <input type='text' name='pid' id='pid' value='"+p.getPid()+"'readonly><br>");
			out.println("Product Name: <input type='text' name='pname' id='pname' value='"+p.getPname()+"'><br>");
			out.println("Product Qty : <input type='text' name='qty' id='qty' value='"+p.getQty()+"'><br>");
			out.println("Product price : <input type='text' name='price' id='price' value='"+p.getPrice()+"'><br>");
			out.println(" <button type='submit' name='btn' id='btn' value='add'>update Product</button>");
		    out.println("</form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
