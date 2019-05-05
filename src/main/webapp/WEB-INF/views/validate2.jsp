<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validator Page</title>
</head>
<body>
	${message}
	<form:form action="validator" modelAttribute="validate2" method="post">
		<!-- Hiển thị tất cả các lỗi -->
		<form:errors path="*" element="ul" />
		<h2>Hien thi thong tin User</h2>
		<div>Name</div>
		<form:input path="name" />
		<div>Mark</div>
		<form:input path="mark" />
		<div>Major</div>
		<form:radiobuttons path="major" items="${majors}" itemLabel="id"
			itemValue="name" />

		<div>
			<button>Validate2</button>
		</div>
	</form:form>
</body>
</html>