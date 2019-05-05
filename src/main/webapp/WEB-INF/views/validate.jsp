

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
<form:form action="validate1" modelAttribute="validate" method="post">
<div>Ho va ten</div>
<form:input path="name"/>
<form:errors path="name"/>

<div>Diem</div>
<form:input path="mark"/>
<form:errors path="mark"/>

<div>
<button>Validate1</button>
</div>

</form:form>
</body>
</html>