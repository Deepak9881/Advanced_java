package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;


public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LoginService ls=new LoginServiceImpl();
		System.out.println("Vivek");
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		String name=req.getParameter("name");
		String bdt=req.getParameter("bdt");
		String uname=req.getParameter("uname");
		String pwd= req.getParameter("pwd");
		String address=req.getParameter("addr");
		String skill[]=req.getParameterValues("check");
		String gen=req.getParameter("gen");
		String city=req.getParameter("city");
	
		
		RegisterUser ru=new RegisterUser(name, uname, address, skill, gen, city,bdt);
		MyUser mu=new MyUser(uname,pwd,"user");
		ls.registerUser(ru,mu);
		
		
		RequestDispatcher rd= req.getRequestDispatcher("Login.html");
		rd.forward(req, resp);
	}

	
}
//	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
/*Enter Name:<input type="text" name="name" id="i1"><br><br>
Enter Username:<input type="text" name="uname" id="i5"><br><br>
Enter Password:<input type="password" name="pwd" id="i2"><br><br>
Enter address:<input type="text" name="addr" id="i3"><br><br>
Select Skill:
<input type="checkbox" name="check" value="Java">
<input type="checkbox" name="check" value="C++">
<input type="checkbox" name="check" value="Python">
<input type="checkbox" name="check" value=".NET"><br><br>
Select gender: 
<input type="radio" name="gen" value="male">Male
<input type="radio" name="gen" value="female"> Female<br><br>
Select city
<select name="city">
<option value="pune">Pune</option>
<option value="mumbai">Mumbai</option>
<option value="Kolhapur"> Kolhapur</option>
<option value="Dharashiv"> Dharashiv</option>
</select><br><br>*/