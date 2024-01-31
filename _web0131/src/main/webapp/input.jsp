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
	request.setCharacterEncoding("utf-8");
%>
r : <%=request.getParameter("text1") %><br/>
d: <%=request.getParameter("text2") %><br/>
t : <%=request.getParameter("text3") %><br/>
</body>
</html>