
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Register Page</title>
</head>
<body>
	<form:form action="/register" method="post"
		modelAttribute="registerForm">
		<form:label path="name">Ho va ten:</form:label>
		<form:input path="name" />
		<br>
		<form:label path="email">Email:</form:label>
		<form:input path="email" />
		<br>
		<form:label path="password">Mat khau:</form:label>
		<form:password path="password" />
		<br>
		<form:label path="checkPassword">Nhap lai mat khau:</form:label>
		<form:password path="checkPassword" />
		<br>
		<form:label path="phoneNumber">So dien thoai:</form:label>
		<form:input path="phoneNumber" />
		<br>
		 <form:radiobuttons path="gender" items="${genders}"/>
		<input type="submit" value="Dang ky" />
	</form:form>
</body>
</html>
