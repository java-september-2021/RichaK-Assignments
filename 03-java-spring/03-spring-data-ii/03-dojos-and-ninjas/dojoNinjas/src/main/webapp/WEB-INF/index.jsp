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
	<hr>
	Dojos Location List
	</hr>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Location
				</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allDojos}" var=dojo>
				<tr>
					<td>${dojo.id}</td>
					<td>${dojo.name}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>