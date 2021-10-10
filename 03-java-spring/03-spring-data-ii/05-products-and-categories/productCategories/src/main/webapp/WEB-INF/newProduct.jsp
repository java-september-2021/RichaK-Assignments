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
<title>New Product</title>
</head>
<body>
	<div class="container">
	<h2>New Product</h2>
	<form:form action="/dojo/createProduct" method="POST" modelAttribute="product">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name"></form:errors>
			<form:input class="form-control" path="name" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description"></form:errors>
			<form:input class="form-control" path="description" />
		</p>
		<p>
			<form:label path="price">Price</form:label>
			<form:errors path="price"></form:errors>
			<form:input class="form-control" path="price" />
		</p>
		<hr>
		<p>
			<button type="submit" class="btn btn-primary">Create</button>
		</p>
	</form:form>
	</div>

</body>
</html>