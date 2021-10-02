<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"/>
<meta charset="UTF-8">
<title>Add Song</title>
</head>
<body>
	<div class="container">
		<h2>Add a new Song</h2>
		<hr></hr>
		<form:form action="/songs" method="POST" modelAttribute="songs">
			<div class="form-group">
				<form:label path="title">Song Title</form:label>
				<form:errors path="title"></form:errors>
				<form:input class="form-control" path="title"/>
			</div>
			<div class="form-group">
				<form:label path="artist">Artist</form:label>
				<form:errors path="artist" />
				<form:input class="form-control" path="artist"/>
			</div>
			<div class="form-group">
				<form:label path="ratings">Rating</form:label>
				<form:errors path="ratings"/>
				<form:input type="number" class="form-control" path="ratings"/>
			</div>
			<hr>
			<p><button>Add Another Song</button></p>
		</form:form>
	</div>
</body>
</html>