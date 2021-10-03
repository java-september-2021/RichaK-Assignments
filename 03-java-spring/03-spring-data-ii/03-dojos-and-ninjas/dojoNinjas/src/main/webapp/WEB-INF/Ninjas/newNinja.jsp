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
<title>New Ninja</title>
</head>
<body>
<div class="container"></div>
	<h2>New Ninja</h2>
	<hr></hr>
	<form:form action="/ninjas/createNinja" method="POST" modelAttribute="ninja">
		<div class="form-group row">
			<form:label path="dojo">Dojo</form:label>
			<form:errors path="dojo"></form:errors>
			<form:select path="dojo">
			<c:forEach items="${allDojos}" value="dojo"> </c:forEach>
			<option value="$dojo.name}">${dojo.name}</option>
			</form:select>
		</div>
		<div class="form-group row">
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName"></form:errors>
			<form:input class="form-control" path="firstName" />
		</div>
		<div class="form-group row">
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName"></form:errors>
			<form:input class="form-control" path="lastName" />
		</div>
		<div class="form-group row">
			<form:label path="age">Age</form:label>
			<form:errors path="age"></form:errors>
			<form:input class="form-control" path="age" />
		</div>
		<p>
			<button type="submit" class="btn btn-primary">Create</button>
		</p>
	</form:form>
</body>
</html>