<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MrAmy</title>
</head>
<body>
<div>
	<%@ include file = "Header.jsp" %>
</div>
<div style="margin:100px 0 0 100px;">
	<form action="Add">
		Enter Number 1: <input type="text" name="num1"><br>
		Enter Number 2: <input type="text" name="num2"><br>
		<input type="submit" value="Submit">
	</form>
</div>

<div style="margin-top:300px;">
	<%@ include file = "Footer.jsp" %>
</div>
</body>
</html>
