<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
	<h1>Submitted Info</h1>
		<div clas="col-1">
		<p>Name : <c:out value="${name}"></c:out></p>
		<p>Dojo Location: <c:out value="${location}"></c:out></p>
		<h3>Favorite Language: <c:out value="${language}"></c:out></h3>
		<h3>Comment: <c:out value="${review}"></c:out></h3>
		</div>
		<buttton> Go Back</buttton>

	</body>
</html>