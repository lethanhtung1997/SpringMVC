<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ELandJSTL Page</title>
</head>
<body>
	<form:form modelAttribute="jstl">
		<h2>Hiển thị thông tin User</h2>
		<table border="1" style="width: 100%">
			<tr>
				<th>Họ và Tên</th>
				<th>Điểm TB</th>
				<th>Chuyên ngành</th>
				<th>Xếp loại</th>
			</tr>

			<c:forEach var="jstl" items="${students}">
				<tr>
					<td>${jstl.name}</td>
					<td>${jstl.score}</td>
					<td>${jstl.major}</td>
					<td><c:choose>
							<c:when test="${8 <= jstl.score <=10 }">Gioi</c:when>
							<c:when test="${7 <= jstl.score <8 }">Khá</c:when>
							<c:when test="${5 <= jstl.score <7 }">Trung bình</c:when>
							<c:when test="${jstl.score <5 }">Yếu</c:when>
							<c:otherwise>Không hợp lệ</c:otherwise>
						</c:choose></td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
</body>
</html>