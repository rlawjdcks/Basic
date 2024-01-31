<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str = "aq";
out.println("<h1>" +str +"</h1>");
%>

<%=str %>
<!-- 두가지의 차이점 위에 등호 없는애는 걍 자바 쓰면 댐
아래에는 변수를 쓰면 댐 -->
</body>
</html>