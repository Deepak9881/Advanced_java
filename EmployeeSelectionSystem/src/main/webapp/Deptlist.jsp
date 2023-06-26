<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.List,com.demo.beans.Department" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" border="2"  style="width:fit-content; background-color:beige;margin:auto;padding:5px;margin-top:20px">
<form action="selectemp" method="post">
<%List<Department>dlist=(List<Department>)request.getAttribute("dlist"); %>
<br>
<select name="deptno">
<option value="0">select Department</option>
<%for(Department d:dlist){ %>
<option value="<%=d.getDeptno()%>"><%=d.getDname() %></option>
<%} %>
</select>
<button type="submit" name="btn" id="btn">Add Employees</button>
</form>
<a href="selectemp" >Show selected Employee</a>
</div>
</body>
</html>