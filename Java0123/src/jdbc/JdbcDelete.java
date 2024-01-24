package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 // MySQL 서버의 JDBC URL, 사용자 이름 및 암호
        String url = "jdbc:mysql://localhost:3306/firm"; // MySQL 데이터베이스의 JDBC URL
        String id = "root"; // 데이터베이스의 사용자 이름
        String pass = "mysql"; // 데이터베이스의 암호
        Scanner scanner = new Scanner(System.in);
        System.out.println("부서번호");
        int deptno= Integer.parseInt(scanner.nextLine());
        System.out.println("부서이름");
        String dname = scanner.nextLine();
        System.out.println("부서위치");
        String loc = scanner.nextLine();
        
		// MySQL JDBC 드라이버를 로드
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, id, pass);
        //여기까지 자바 프로그램이 데이터베이스에 대신 연결
     // createStatement() sql 만들어 명령문 전달 Statement 객체 생성
        Statement stmt = conn.createStatement();
        String sql = "insert into dept values ("+deptno+",'"+dname+"','"+loc+"')";
        int result =  stmt.executeUpdate(sql);
        if (result == 1) {
			System.out.println("sc");
		} else {
			System.out.println("no");
		}
	}

}