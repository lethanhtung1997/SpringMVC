<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
<h2>Hiển thi thông tin về sản phẩm</h2>
<ul>
<li>Tên sản phẩm: ${product.name}</li>
<li>Đơn giá: 
<fmt:formatNumber value="${product.price}" type="currency"/>
</li>
<li>Giảm giá:
<fmt:formatNumber value="${product.discount}" type="percent"/>
</li>
<li>Ngày nhập:
<<fmt:formatDate value="${product.date}" pattern="dd-MM-yyyy"/>
</li>
</ul>

</body>
</html>