<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<title>Lookify App</title>
</head>
<body>
	<div class="container">
		<a class="float-right" href="/songs">Dashboard</a>
		<h3>Song Title</h3>
		<p>${song.title}</p>
		<h3>Artist</h3>
		<p>${song.artist}</p>
		<h3>Rating</h3>
		<p>${song.ratings}</p>
		<form action="/songs/${song.id}" method="post">
			<input type="hidden" name="_method" value="delete" /> <input
				class="btn btn-danger" type="submit" value="Delete" />
		</form>
	</div>
</html>