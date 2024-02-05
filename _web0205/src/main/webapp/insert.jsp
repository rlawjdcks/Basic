<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
//String driver=  "oracle.jdbc.driver.OracleDriver";
//Class.forName(driver);
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url, "scott","tiger");
String sql = "INSERT INTO score (num,name,kor,eng,math) VALUES (?,?,?,?,?)";
PreparedStatement pstm = conn.prepareStatement(sql);
pstm.setString(1, request.getParameter("num"));
pstm.setString(2, request.getParameter("name"));
pstm.setString(3, request.getParameter("kor"));
pstm.setString(4, request.getParameter("eng"));
pstm.setString(5, request.getParameter("math"));
int result = pstm.executeUpdate();
if(result == 1){
	out.println("성공");
	response.sendRedirect("oralist.jsp");
}else {
	out.println("no");
}
%>
</body>
</html>