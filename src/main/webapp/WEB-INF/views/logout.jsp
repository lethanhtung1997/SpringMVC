<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty username }">
Chao mung {username} den website cua minh</c:when>
		<c:otherwise>Vui long dang ky hoac dang nhap
		<br>
			<a href="/register">Dang ky</a>
			<a href="/login1">Dang nhap</a>
		</c:otherwise>
	</c:choose>
</body>
</html>