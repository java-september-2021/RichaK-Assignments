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
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
		 <tbody>
				<c:forEach items="${allLanguages}" var="language">
					<tr>
						<td><a href="/show/${language.id}">${language.name}</a></td>
						<td>${language.creator}</td>
						<td>${language.version}</td>
						<td><a href="/edit/${language.id}">Edit</a> | <a href="/delete/${language.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody> 
		</table>
		<h3>Create new language form</h3>
		<form:form action="/" method="POST" modelAttribute="language">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name"></form:errors>
				<form:input path="name" />
			<p>
				<form:label path="creator">Creator</form:label>
				<form:errors path="creator"></form:errors>
				<form:input path="creator" />
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version"></form:errors>
				<form:input path="version" />
				
			<p>
			<button>Submit</button>
		</form:form>

	</div>
</body>
</html>