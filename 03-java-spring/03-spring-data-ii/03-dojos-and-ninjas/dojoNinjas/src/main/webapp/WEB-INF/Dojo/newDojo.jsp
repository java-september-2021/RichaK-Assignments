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
<title>New Dojo</title>
</head>
<body>
	<div class="container"></div>
	<h2>New Dojo</h2>
	
	<form:form action="/dojos/addDojo" method="POST" modelAttribute="dojo">
		<div class="form-group row">
			<form:label for="formGroupExampleInput" path="name">Name</form:label>
			<form:errors path="name"></form:errors>
			<form:input id="formGroupExampleInput" class="form-control" path="name" />
		</div>
		<p>
			<button type="submit" class="btn btn-primary">Create</button>
		</p>
	</form:form>
</body>
</html>