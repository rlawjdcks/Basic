package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("tt");
		Connection conn =DriverManager.getConnection(url, id, pass);
		System.out.println("성공");

		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from dept");
		while (rs.next()) {
			int deptno =  rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d,%s,%s\n",deptno,dname,loc);
		}
		
		
		conn.close();
	}
	

}
