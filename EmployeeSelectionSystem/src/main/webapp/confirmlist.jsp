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
<table border="2">
	<tr>
	<th>Employee number</th>
	<th>Employee name</th>
	<th>Department no</th>
	<th>Employee Salary</th>
	</tr>
<c:forEach var="emp" items="${eset}">
    <tr>
      <td>${emp.empno}</td>
      <td>${emp.ename}</td>
      <td>${emp.deptno}</td>
      <td>${emp.sal}</td>
      
    </tr>
 
</c:forEach>
 </table><br>
</table>
<a href="logout" >Logout</a>
</body>
</html>