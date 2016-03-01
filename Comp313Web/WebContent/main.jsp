<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h3.serif {
    font-family: "Comic Sans MS", cursive, sans-serif;
}
h1.main {
    font-family: "Comic Sans MS", cursive, sans-serif;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1 class="main">Hello <i> ${sessionScope.currentUser.f_Name}</i></h1>

<h3 class="serif">You have following devices:</h3><img src="phone.jpg" height="80" width="100"><br><br>
<c:forEach items = "${sessionScope.myDevices}" var="device">
        	<a href="LocationServlet?id=${device.getD_ID()}">${ device.getD_name()}</a>
            <a></a><br></br>
        </c:forEach>
</body>
</html>