<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%
	//int-> number(자릿수 마음대로)로 사용
	//varchar(20) -> varchar2(20)
	//statement -> PreparedStatement사용
	//response.sendRedirect("이동할_페이지명"); 사용
	//1.얘네 오라클로 바꾸고 2. delete update insert 다 가능하게 crud
	//3. 이제 최고점수 전체평균 구현해보기

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	try (Connection conn = DriverManager.getConnection(url, "scott","tiger");) {

		out.println("DB 접속 성공 !");

	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

</body>
</html>