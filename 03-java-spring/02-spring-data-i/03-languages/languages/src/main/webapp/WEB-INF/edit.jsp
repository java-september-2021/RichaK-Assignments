<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Language</title>
</head>
<body>
<p><a href="">Delete</a> | <a href="/">Dashboard</a>
<form:form action="/edit/${language.id}" method="POST" modelAttribute="language">
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
			<input type="hidden" name="_method"  value="put">
			<button>Submit</button>
		</form:form>
</body>
</html>