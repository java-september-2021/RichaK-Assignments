<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<title>Dojos List</title>
</head>
<body>
	<h1><c:out value="${dojo.name}">Locations Ninja</c:out></h1>
	<table>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	</tr>
	<c:forEach items="${dojo.ninjas}" var ="ninja"></c:forEach>
	<td><c:out value = "${ninja.firstName}"></c:out></td>
	<td><c:out value = "${ninja.lastName}"></c:out></td>
	<td><c:out value = "${ninja.age}"></c:out></td>
	</table>

</body>
</html>