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
String driver=  "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
    try ( 
        Connection conn = DriverManager.getConnection(
        		url, "scott","tiger");
    ) {
        
        String[][] score = {
            { "1", "홍길동", "50", "60", "70" }, 
            { "2", "이순신", "65", "75", "85" }, 
            { "3", "강감찬", "60", "80", "70" }
        };
        
        for (int i = 0; i < score.length; i++) {
            String sql = String.format(
                    "insert into score values (%s, '%s', %s, %s, %s)",
                    score[i][0], score[i][1], score[i][2], 
                    score[i][3], score[i][4]);
            
    		PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            out.println("쿼리 실행 성공 : " + sql + "<br>");
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>