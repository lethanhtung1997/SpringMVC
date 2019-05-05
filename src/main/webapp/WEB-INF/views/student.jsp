<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit student</title>
</head>
<body>
	<form:form action="update" modelAttribute="student">

		<h2>Hiển thị thông tin User</h2>
		<form:label path="name">Username: </form:label>
		<form:input path="name" />
		<br>
		<form:label path="name">Mark: </form:label>
		<form:input path="mark" />
		<br>
		<form:label path="major">Major: </form:label>
		<form:select path="major" items="${majors}" itemLabel="id"
			itemValue="name" />
		<br>
		<form:label path="gender">Gender: </form:label>
		<form:radiobuttons path="gender" items="${genders}" />
		<br>
		<form:label path="languages">Languages: </form:label>
		<<form:checkboxes items="${languages}" path="languages" />
		<br>
		<form:label path="hobbies">Favorites: </form:label>
		<form:select path="hobbies" multiple="true" items="${hobbies}" />
		<br>
		<input type="submit" value="Edit student">
	</form:form>
</body>
</html>