<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">목록으로</a>
<form action="insert.jsp" method = "post">
<input type="text" name="ename"></br>
<input type="text" name="job"></br>
<input type="text" name="sal"></br>
<input type="submit" value="데이터삽입"> 

<input type="reset" />
</form>

</body>
</html>