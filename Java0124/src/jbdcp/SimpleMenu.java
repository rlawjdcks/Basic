package jbdcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu{

    private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            boolean exit = false;

            while (!exit) {
                System.out.println("1. 데이터 보기");
                System.out.println("2. 데이터 삽입");
                System.out.println("3. 종료");
                System.out.print("선택하세요: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        viewData(connection);
                        break;
                    case "2":
                        insertData(connection);
                        break;
                    case "3":
                        exit = true;
                        break;
                    default:
                        System.out.println("유효하지 않은 선택. 다시 시도하세요.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewData(Connection connection) {
		List<Dept> list = new ArrayList<>();

    	Statement stmt = null;
		Connection conn = null;
		String sql = "select deptno, dname, loc from dept";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Dept dept : list) {
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLoc()); // 이 라인은 삭제하고 각 컬럼별로 출력해 보세요.
		}
		
    }

    private static void insertData(Connection connection) {
        System.out.println("부서번호");
        int deptno= Integer.parseInt(scanner.nextLine());
        System.out.println("부서이름");
        String dname = scanner.nextLine();
        System.out.println("부서위치");
        String loc = scanner.nextLine();
        int result = 0;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmt = connection.createStatement();
			String sql = "insert into dept values ("+deptno+",'"+dname+"','"+loc+"')";
			result =  stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("sc");
			} else {
				System.out.println("no");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("error");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}