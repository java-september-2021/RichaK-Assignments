<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Date</title>
</head>
<body>
	<c:set var="Date" value="<%=new java.util.Date()%>"/> 
	<p>  
Formatted Date :  
<fmt:formatDate type="date" value="${Date}" />  
</p>  
</body>
</html>