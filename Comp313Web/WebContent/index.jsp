<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style> 
body {
    background:url("login.jpg");
    background-size:554px 388px;
    background-repeat:no-repeat;
    
    
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find my phone</title>
</head>
<body><pre><b><h3>
<form action="${pageContext.request.contextPath}/userServlet" method="get"><br><br><br><br><br>




                                                                   User Name &nbsp;<input type="text" name="uname"><br><br>
			                                           Password &nbsp; <input type="password" name="pwd"><br><br>
			
			
			                                              <input type ="submit" value="Login" name="loginbtn" style="text:align:center">           <input type ="submit" value="Register" name="loginbtn" style="text:align:center">

</form>
</h3>
</body>
</html>