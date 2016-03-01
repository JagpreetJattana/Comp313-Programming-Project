<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style> 
body {
    background: url("Registration.jpg");
    background-size: 300px 150px;
    background-repeat: no-repeat;
    padding-bottom: 200px;
    
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to registration</title>
</head>
<body><pre><b>
<form action="${pageContext.request.contextPath}/registerServlet" method="get">
		<h2 style="color:red ">                                         Enter your information to register</h2>
		         	                               User Id:           <input type="text" name="uId"><br><br>
			                                       First Name         <input type="text" name="fName"><br><br>
				                               Last Name          <input type="text" name="lName"><br><br>
			                                       Password           <input type="password" name="password"><br><br>
			                                       Confirm            <input type="password" name="confirmPassword"><br><br>
			                                       House No.          <input type="text" name="houseNO"><br><br>
			                                       Street             <input type="text" name="street"><br><br>
			                                       City               <input type="text" name="city"><br><br>
			                                       Province           <input type="text" name="province"><br><br>
			                                       Country	  	  <input type="text" name="country"><br><br>
			                                       PostalCode         <input type="text" name="postalCode"><br><br>
			                                       Contact            <input type="text" name="contact"><br><br>
			                                       E-Mail             <input type="text" name="eMail"><br><br>
			                                                   <input type ="submit" value="Register" name="regbtn" style="text:align:center">
</form><pre></b>
</body>
</html>