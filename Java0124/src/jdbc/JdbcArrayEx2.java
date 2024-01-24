package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Dept2{
	int deptno;
	String danme;
	String loc;
	public Dept2(int deptno, String danme, String loc) {
		super();
		this.deptno = deptno;
		this.danme = danme;
		this.loc = loc;
	}
}

public class JdbcArrayEx2 {
	
	public static void main(String[] args) {
        List<Dept> dataList = new ArrayList<>();

		String url = "jdbc:mysql://localhost:3306/firm"; // MySQL 데이터베이스의 JDBC URL
		String id = "root"; // 데이터베이스의 사용자 이름
		String pass = "mysql"; // 데이터베이스의 암호
		Statement stmt = null;
		Connection conn = null;
		String sql = "select deptno, dname, loc from dept";
		
		
		//다중 try catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
		    while (rs.next()) {
//		    	int deptno = rs.getInt(1); //sql에서 select에서 가져온 첫번째거 호출한다는 뜻임
		    	int deptno = rs.getInt("deptno");
		    	String dname = rs.getString("dname");
		    	String loc = rs.getString("loc");
//		    	String str = deptno+","+dname+","+loc;
//		    	dataList.add(str);
		    	Dept dept = new Dept(deptno, dname, loc);
		    	dataList.add(dept);
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	     for (Dept dept : dataList) {
	            System.out.println(dept);
	        }

	}

}
