<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Time</title>
</head>
<body>
<c:set var="Date" value="<%=new java.util.Date()%>"/> 
<h3>Formatted Time :  
<fmt:formatDate type="time" value="${Date}"/>  
	
</body>
</html>