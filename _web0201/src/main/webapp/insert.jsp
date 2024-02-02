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
String driver=  "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott","tiger");
String sql = "INSERT INTO emp1 (ename,job,sal) VALUES (?,?,?)";
PreparedStatement pstm = conn.prepareStatement(sql);
pstm.setString(1, request.getParameter("ename"));
pstm.setString(2, request.getParameter("job"));
pstm.setString(3, request.getParameter("sal"));
int result = pstm.executeUpdate();
if(result == 1){
	out.println("s");
}else {
	out.println("n");
}
%>
<a href="select.jsp">목록으로</a>
<button onclick="location.href='select.jsp' ">목록으로</button>
</body>
</html>