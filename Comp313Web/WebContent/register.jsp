<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to registration</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerServlet" method="get">
		<h2 style="color:red ">Enter your information to register</h2>
			User Id:   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="uId"><br><br>
			First Name &nbsp;<input type="text" name="fName"><br><br>
			Last Name &nbsp;<input type="text" name="lName"><br><br>
			Password   &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br><br>
			Confirm    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="confirmPassword"><br><br>
			House No.  &nbsp;&nbsp;<input type="text" name="houseNO"><br><br>
			Street    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="street"><br><br>
			City    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="city"><br><br>
			Province   &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;<input type="text" name="province"><br><br>
			Country		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="country"><br><br>
			PostalCode   <input type="text" name="postalCode"><br><br>
			Contact    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="contact"><br><br>
			E-Mail     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="eMail"><br><br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="submit" value="Register" name="regbtn" style="text:align:center">
		</form>
</body>
</html>