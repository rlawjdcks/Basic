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

Cookie ck = new Cookie("aaa","bbb");
ck.setMaxAge(30);//30초
response.addCookie(ck);

%>
<%=ck.getName() %></br> 
<%=ck.getValue() %></br> 
</body>
</html>