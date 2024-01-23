package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // MySQL 서버의 JDBC URL, 사용자 이름 및 암호
        String url = "jdbc:mysql://localhost:3306/firm"; // MySQL 데이터베이스의 JDBC URL
        String id = "root"; // 데이터베이스의 사용자 이름
        String pass = "mysql"; // 데이터베이스의 암호

        // MySQL JDBC 드라이버를 로드
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 데이터베이스에 연결
        Connection conn = DriverManager.getConnection(url, id, pass);

        // Statement 객체 생성
        Statement stmt = conn.createStatement();

        // SQL 쿼리를 실행하고 결과를 얻어옴
        ResultSet rs = stmt.executeQuery("select ename, sal from emp");

        // 결과 집합을 순회하면서 데이터 출력
        while (rs.next()) {
            int sal =  rs.getInt("sal");
            String ename = rs.getString("ename");
            System.out.printf("%s,%s\n", sal, ename);
        }

        // 연결을 닫음
        conn.close();
    }
}