package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/conpany";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection(url, id, pass);

		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select ename, sal from emp");
		while (rs.next()) {
			int sal =  rs.getInt("sal");
			String ename = rs.getString("ename");
			System.out.printf("%s,%s\n",sal,ename);
		}
		
		
		conn.close();
	}
	

}
