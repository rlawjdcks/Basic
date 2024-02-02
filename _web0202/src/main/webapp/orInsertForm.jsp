<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="orSelect.jsp">목록으로</a>
<form action="orInsert2.jsp" method = "post">
<input type="text" name="num"></br>
<input type="text" name="name"></br>
<input type="text" name="kor"></br>
<input type="text" name="eng"></br>
<input type="text" name="math"></br>
<input type="submit" value="저장하기"> 

<input type="reset" />
</form>
</body>
</html>