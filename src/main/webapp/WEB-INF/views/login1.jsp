<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	${message}
	<form:form action="/login" method="post" modelAttribute="loginForm">
		<form:label path="email">Email:</form:label>
		<form:input path="email" />
		<form:label path="password">Password:</form:label>
		<form:input path="password" />
		<br>
		<input type="submit" value="Dang nhap" />
	</form:form>
</body>
</html>