<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Hello ${sessionScope.currentUser.f_Name}</h1>
<h3>You have following devices:</h3>
 <c:forEach items = "${sessionScope.myDevices}" var="device">
        	<a href="LocationServlet?id=${device.getD_ID()}">${ device.getD_name()}</a>
            <a></a><br></br>
        </c:forEach>
</body>
</html>