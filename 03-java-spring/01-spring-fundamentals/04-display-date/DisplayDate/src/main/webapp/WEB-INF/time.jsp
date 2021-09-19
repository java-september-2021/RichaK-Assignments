<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Time</title>
	<!-- <script defer type="text/javascript" src="js/main.js"></script> -->
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>	

<body>
<script>
	alert("The window is showing current time")
</script>
<p class="time"><fmt:formatDate pattern="h:mm a" value="${datetime}"/>  
	
</body>
</html>