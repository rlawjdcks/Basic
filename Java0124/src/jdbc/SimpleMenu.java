package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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