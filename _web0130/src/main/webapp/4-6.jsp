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
	//post 방식일때 이러면 한글 안깨짐
	request.setCharacterEncoding("utf-8");
%>


아이디 : <%=request.getParameter("id") %><br/>
비번 : <%=request.getParameter("pw") %><br/>
성별 : <%=request.getParameter("gender") %><br/>
가입경로 : <%=request.getParameter("intro") %><br/>
주소 : <%=request.getParameter("addr") %><br/>
메모 : <%=request.getParameter("memo") %><br/>

</body>
</html>