<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find my phone</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userServlet" method="get">
User Name &nbsp;<input type="text" name="uname"><br><br>
			Password &nbsp;<input type="password" name="pwd"><br><br>
			
			
			<input type ="submit" value="Login" name="loginbtn" style="text:align:center">
			
			<input type ="submit" value="Register" name="loginbtn" style="text:align:center">

</form>

</body>
</html>