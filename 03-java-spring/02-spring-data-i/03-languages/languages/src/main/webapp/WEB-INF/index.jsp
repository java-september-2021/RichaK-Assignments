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
<title>Language Dashboard</title>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th name="name">Name</th>
					<th name="creator">Creator</th>
					<th name="version">Version</th>
					<th name="action"></th>
				</tr>
			</thead>
			 <tbody>
				<c:forEach var="language" items="{allLanguage}">
					<tr>
						<td><c:out value="${language.id}"></c:out></td>
						<td><c:out value="${language.name}"></c:out></td>
						<td><c:out value="${language.creator}"></c:out></td>
						<td><c:out value="${language.version}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody> 
		</table>


	</div>
</body>
</html>