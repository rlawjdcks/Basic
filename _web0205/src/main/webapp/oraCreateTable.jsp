User
<%@page import="org.apache.catalina.connector.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
    try ( 
        Connection conn = DriverManager.getConnection(
        		url, "scott","tiger");
    	
    ) {
    	String sql = 
                "create table score (" + 
                "    num  number(7,2)          primary key," + 
                "    name varchar2(20),             " +
                "    kor  number(7,2),                     " +    
                "    eng  number(7,2),                     " +
                "    math number(7,2)                      " +    
                ")";
  		PreparedStatement pstm = conn.prepareStatement(sql);
   		pstm.executeQuery();
        out.println("성적 테이블 생성 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>