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
<form>


</form action="/postSurvey" method="POST">
Your Name: <input type="text" name="name" placeholder="yourname">
<br>
Dojo Location: 
<select name="location" id="location">
<option value="SanJose">San Jose</option>
<option value="burbank">Burbank</option>
<option value="paloalto">Palo Alto</option>
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
<button>Button</button>


</body>
</html>