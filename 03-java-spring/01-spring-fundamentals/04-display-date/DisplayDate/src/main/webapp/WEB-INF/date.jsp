<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Date</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script defer type="text/javascript" src="js/main.js"></script>
</head>

<body> 
<script>alert("The window is showing current date")</script>
<p class="date"><fmt:formatDate pattern="EEEE 'the' dd 'of' MMMM,YYYY" value="${datetime}"/></p>  
</body>
</html>