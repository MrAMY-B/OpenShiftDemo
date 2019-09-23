<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MrAmy</title>
</head>
<body>
<p style="color:red;">${msg}</p>
<div>
	<%@ include file = "Header.jsp" %>
</div>
<br>
name= amy  Pass= pass
<div style="margin:100px;">
	<form action="DoLogin" method="post">
			Name : <input type="text" name="name"> <br><br>
			Pass  : <input type="password" name="pass"> <br><br>
			<input type="submit">
	</form>
</div>
<div style="margin-top:300px;">
	<%@ include file = "Footer.jsp" %>
</div>
</body>
</html>
