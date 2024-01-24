package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Aaa{
	int empno;
	String ename;
	Double sal;
	public Aaa(int empno, String ename, Double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
}
public class JdbcPro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		List<Aaa> dataList = new ArrayList<>();
		 // MySQL 서버의 JDBC URL, 사용자 이름 및 암호
        String url = "jdbc:mysql://localhost:3306/firm"; // MySQL 데이터베이스의 JDBC URL
        String id = "root"; // 데이터베이스의 사용자 이름
        String pass = "mysql"; // 데이터베이스의 암호
		// MySQL JDBC 드라이버를 로드
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, id, pass);
        //여기까지 자바 프로그램이 데이터베이스에 대신 연결
     // createStatement() sql 만들어 명령문 전달 Statement 객체 생성
        Statement stmt = conn.createStatement();
        String sql = "select * from emp";
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
//            System.out.print(rs.getInt("empno"));
//            System.out.print(rs.getString("ename"));
//            System.out.println(rs.getDouble("sal"));
            dataList.add(new Aaa(rs.getInt("empno"),rs.getString("ename"), rs.getDouble("sal")));
        }
        
        
	}

	    public void getDataFromDatabase() throws ClassNotFoundException, SQLException {
	        List<Aaa> dataList = new ArrayList<>();
	        // MySQL 서버의 JDBC URL, 사용자 이름 및 암호
	        String url = "jdbc:mysql://localhost:3306/firm"; // MySQL 데이터베이스의 JDBC URL
	        String id = "root"; // 데이터베이스의 사용자 이름
	        String pass = "mysql"; // 데이터베이스의 암호
	        // MySQL JDBC 드라이버를 로드
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, id, pass);
	        //여기까지 자바 프로그램이 데이터베이스에 대신 연결
	        // createStatement() sql 만들어 명령문 전달 Statement 객체 생성
	        Statement stmt = conn.createStatement();
	        String sql = "select * from emp";
	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            dataList.add(new Aaa(rs.getInt("empno"), rs.getString("ename"), rs.getDouble("sal")));
	        }

	        // 이제 dataList에는 MySQL 데이터베이스에서 가져온 데이터가 들어있습니다.
	        // 원하는 방식으로 dataList을 활용할 수 있습니다.

	        // 예를 들어, 데이터 출력
	        for (Aaa data : dataList) {
	            System.out.println("empno: " + data.empno + ", ename: " + data.ename + ", sal: " + data.sal);
	        }
	    }
	}