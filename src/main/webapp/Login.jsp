<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">${msg}</font>
<form action="<core:url value='j_spring_security_check'/>" method='POST'>
mail id/username:<input type ="text"name="userName"/></br>
password:<input type ="password"name="pwd"/></br>
<input type="submit"value="login"/>
</form>
<font color="blue"><a href="Register.jsp">Registerpage</a></font>
</body>
</html>