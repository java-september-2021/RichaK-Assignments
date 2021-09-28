<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Language</title>
</head>
<body>
<P><a href="/">Dashboard</a></P>
<c:out value="${thisLanguage.name}"></c:out>
<c:out value="${thisLanguage.creator}"></c:out>
<c:out value="${thisLanguage.version}"></c:out>

<p><a href="/edit/${thisLanguage.id}"> Edit</a>
<p><a href="delete/${thisLanguage.id}"> Delete</a>




</body>
</html>