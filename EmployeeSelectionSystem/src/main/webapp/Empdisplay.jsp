<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="emplist" method="post">
<table border="2">
   <tr>
      <th>Employee no</th>
   	  <th>Employee name</th>
   	  <th>Employee sal</th>
   	  <th>Employee deptno</th>
   	  <th>Selection</th>
   	  
   </tr>
<c:forEach var="emp" items="${elist}">
    <tr>
      <td>${emp.empno}</td>
      <td>${emp.ename}</td>
      <td>${emp.sal}</td>
      <td>${emp.deptno}</td>
      <td><input type="checkbox" name="check" id="check" value="${emp.empno}:${emp.ename}:${emp.sal}" }></td>
      
    </tr>
 
</c:forEach>
</table>
<input type="hidden" name="deptno" value=${deptno} > <br><br>
<button type="submit" name="btn">Add Employees</button>
</form> <br>
<a href="deptlist">Add more Employee</a>
<a href="logout">Logout</a>
</body>
</html>