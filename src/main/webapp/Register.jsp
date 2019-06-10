<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">${errormessege}</font>
<form action="application">
Name:<input type="text"name="nam"/></br>
Username:<input type="text"name="usrnam"/></br>
Mobileno:<input type="text"name="mbl"/></br>
Mailid:<input type="text"name="mail"/></br>
Password:<input type="password"name="pwd"/></br>
<input type="submit"value="click"/>
</form>
<form action="testing">
<input type="submit"value="Test"/>
</form>
<font color="blue"><a href="Login.jsp">Loginpage</a></font>
</body>
</html>