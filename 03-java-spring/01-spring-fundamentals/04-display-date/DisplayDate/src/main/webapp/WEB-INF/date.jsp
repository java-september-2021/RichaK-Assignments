<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Date</title>
	<script defer type="text/javascript" src="js/main.js"></script>
	<link rel="stylesheet" href="css/style.css"/>
</head>
<body> 
<script>dateAlert()</script>
<p class="date"><fmt:formatDate pattern="EEEE 'the' dd 'of' MMMM,YYYY" value="${datetime}"/></p>  
</body>
</html>