<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수입력</title>
</head>
<body>
<!--방식은 get과 post방식 get방식은 url에 키,값이 나옴  -->
<form action="4-2.jsp" method="get">
	국<input type="text" name="kor"></br> 
	영<input type="text" name="eng"></br> 
	수<input type="text" name="math"></br>
	<input type="submit" value="확인"></br>
</form>
</body>
</html>