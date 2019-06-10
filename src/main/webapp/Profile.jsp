<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

function deleteTest1(mail) {
	alert('triggred Delete button' + mail);
	//http://localhost:8080/whatsapp/deleteUser?mailIdToDelete='virat@gmail.com'
	document.forms[0].action="${pageContext.request.contextPath}/deleteTest1?mailToDelete="+mail;
document.forms[0].method="post";
	document.forms[0].submit();	
	//submit to deleteUser action from here
}

function editTest1(mail) {
	alert('triggered Edit button' + mail);
	//http://localhost:8080/whatsapp/deleteUser?mailIdToDelete='virat@gmail.com'
	document.forms[0].action="${pageContext.request.contextPath}/editTest1?mailToEdit="+mail;
	document.forms[0].method="post";
	document.forms[0].submit();	

}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<core:url value="/j_spring_security_logout" />" >Logout</a>
<form action="">
	<!-- Need to write for each loop in jsp to iterate testList -->
	<table border="3">
		<tr>
			<th>Name</th>
			<th>Username</th>
			<th>Mobileno</th>
			<th>Mailid</th>
			<th>Password</th>
		</tr>
		<core:forEach var="userObject" items="${uList}">
			<tr>
				<td>${userObject.nam}</td>
				<td>${userObject.usrnam}</td>
				<td>${userObject.mbl}</td>
				<td>${userObject.mail}</td>
				<td>${userObject.pwd}</td>
                <td><input type="button" onclick="editTest1('${userObject.mail}')" value="Edit"></td>
				<td><input type="button" onclick="deleteTest1('${userObject.mail}')" value="Delete"></td>
			</tr>
		</core:forEach>

	</table>
	</form>
		${Key1}
</body>
</html>