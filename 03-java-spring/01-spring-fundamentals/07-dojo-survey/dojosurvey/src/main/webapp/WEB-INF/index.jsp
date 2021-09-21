<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
</head>
<body>
<div class="container">
<form method="POST" action="/survey">
Your Name: <input type="text" name="name" placeholder="yourname">
<br>
Dojo Location: 
<select name="location" id="location">
<option value="san jose">San Jose</option>
<option value="burbank">Burbank</option>
<option value="palo alto">Palo Alto</option>
</select>
<br>
Favorite Language:
<select name="language" id="language">
<option value="python">Python</option>
<option value="java">Java</option>
<option value="javascript">JavaScript</option>
</select>
</div>
<br>
<p>Comment (optional)
<br>
<textarea name="review" rows="4" col="30"></textarea>
<br>
<button>Submit</button>
</form>
</body>
</html>