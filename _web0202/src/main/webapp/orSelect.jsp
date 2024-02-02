<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table {
            width: 600px;
            text-align: center;
            border-collapse: collapse;
            margin: 20px auto;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
        }



    </style>    
</head>
<body>

<table>
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
        <th>최고점수</th>
        <th>삭제여부</th>
        <th>수정</th>
    </tr>
<%
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
try ( 
    Connection conn = DriverManager.getConnection(url, "scott", "tiger");
) {
    String sql = "select num, name, kor, eng, math from score";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery("select * from score");
    
    int totalKor = 0;
    int totalEng = 0;
    int totalMath = 0;
    int recordCount = 0;
    
    int maxKor = Integer.MIN_VALUE;
    int maxEng = Integer.MIN_VALUE;
    int maxMath = Integer.MIN_VALUE;

    while (rs.next()) {
        int kor = rs.getInt("kor");
        int eng = rs.getInt("eng");
        int math = rs.getInt("math");
        
        int sum = kor + eng + math;

        // 최고 점수 계산
        maxKor = Math.max(maxKor, kor);
        maxEng = Math.max(maxEng, eng);
        maxMath = Math.max(maxMath, math);

        totalKor += kor;
        totalEng += eng;
        totalMath += math;
        recordCount++;
%>          
        <tr>
            <td><%=rs.getString("num")%></td>
            <td><%=rs.getString("name")%></td>
            <td><%=kor%></td>
            <td><%=eng%></td>
            <td><%=math%></td>
            <td><%=sum%></td>
            <td><%=String.format("%.2f", (float)sum / 3)%></td>
            <td><%=Math.max(Math.max(kor, eng), math)%></td>
            <td><a href="orDelete.jsp?name=<%=rs.getString("name")%>" style="color: red;">삭제</a></td>
            <td><a href="orUpdateForm.jsp?name=<%=rs.getString("name")%>" style="color: blue;">수정</a></td>
        </tr>
<%          
    }

    // 전체 평균 계산
    float overallAvgKor = (float) totalKor / recordCount;
    float overallAvgEng = (float) totalEng / recordCount;
    float overallAvgMath = (float) totalMath / recordCount;
    float overallAvg = (overallAvgKor + overallAvgEng + overallAvgMath) / 3;

%>
    <tr style="background-color: #4CAF50; color: white;">
        <td colspan="2">전체평균</td>
        <td><%=String.format("%.2f", overallAvgKor)%></td>
        <td><%=String.format("%.2f", overallAvgEng)%></td>
        <td><%=String.format("%.2f", overallAvgMath)%></td>
        <td></td>
        <td><%=String.format("%.2f", overallAvg)%></td>
        <td><%=Math.max(Math.max(maxKor, maxEng), maxMath)%></td>
        <td></td>
        <td></td>
    </tr>
    <tr style="background-color: #4CAF50; color: white;">
        <td colspan="2">최고점수</td>
        <td><%=maxKor%></td>
        <td><%=maxEng%></td>
        <td><%=maxMath%></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>

<%        
} catch(Exception e) {
    e.printStackTrace();
}
%>
</table>
<a href="orInsertForm.jsp" style="color: #4CAF50;">사람,점수 입력</a>

</body>
</html>
