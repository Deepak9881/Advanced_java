<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" border="2"  style="width:fit-content; background-color:beige;margin:auto;padding:5px;margin-top:20px">
 <h1>Planner Details Home Page</h1>
 <form action="addplan" method="post">
 	Enter Date: <input type="Date" name="date" id="date"><br><br>
     	 Enter Task Info:<input type="text" name="desc" id="desc"><br><br>
      	<button type="submit" name="btn"> Add Plan to Planner</button>
</form>
</div>
</body>
</html>