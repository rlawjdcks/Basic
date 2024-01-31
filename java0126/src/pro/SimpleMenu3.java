package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu3 {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner scanner = new Scanner(System.in);
	static int cancel = 0;

	public static void main(String[] args) {

		
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 데이터 삭제");
				System.out.println("4. 데이터 수정");
				System.out.println("5. 종료");
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
					deleteData(connection);
					break;
				case "4":
					updateDate(connection);
					break;
				case "5":
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

	private static void cancel() {
		System.out.println("계속 진행 하려면 1번 취소하고싶으면 다른 숫자를 누르세요");
		cancel = Integer.parseInt(scanner.nextLine());
	}

	private static void viewData(Connection connection) {
		List<Emp> list = new ArrayList<>();

		Statement stmt = null;
		Connection conn = null;
		String sql = "select * from emp";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Emp dept : list) {
			System.out.println(dept.getEmpno() + "\t" + dept.getEname() + "\t" + dept.getJob() + "\t" + dept.getMgr()
					+ "\t" + dept.getHiredate() + "\t" + dept.getSal() + "\t" + dept.getComm() + "\t"
					+ dept.getDeptno()); // 이 라인은 삭제하고 각 컬럼별로 출력해 보세요.
		}

	}

	private static void insertData(Connection connection) {
		cancel();

		if (cancel == 1) {

			System.out.println("번호");
			int empno = Integer.parseInt(scanner.nextLine());
			System.out.println("이름");
			String ename = scanner.nextLine();
			System.out.println("직업");
			String job = scanner.nextLine();
			System.out.println("mgr넣기");
			int mgr = Integer.parseInt(scanner.nextLine());
			System.out.println("고용일");
			String hiredate = scanner.nextLine();
			System.out.println("월급");
			Double sal = Double.parseDouble(scanner.nextLine());
			System.out.println("comm넣기");
			Double comm = Double.parseDouble(scanner.nextLine());
			System.out.println("부서번호");
			int deptno = Integer.parseInt(scanner.nextLine());

			int result = 0;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Statement stmt = connection.createStatement();
				String sql = "insert into emp values (" + empno + ",'" + ename + "','" + job + "'," + mgr + ",'"
						+ hiredate + "'," + sal + "," + comm + "," + deptno + ")";
				result = stmt.executeUpdate(sql);
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
		} else if (cancel == 2) {
			System.out.println("취소합니다");
		}

	}

	private static void deleteData(Connection connection) {
		cancel();

		if (cancel == 1) {

			System.out.println("삭제할 행의 empno 를 입력하세요");
			int empno = Integer.parseInt(scanner.nextLine());

			int result = 0;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Statement stmt = connection.createStatement();
				String sql = "delete from emp where empno = " + empno;
				result = stmt.executeUpdate(sql);
				if (result == 1) {
					System.out.println("sc");
				} else {
					System.out.println("no");
				}
			} catch (ClassNotFoundException e) {
				System.out.println("error");
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void updateDate(Connection connection) {
		cancel();
		if (cancel==1) {
			
			System.out.println("수정할 항목");
			System.out.println("empno ename job mgr hiredate sal comm deptno 중 한가지 변경할 것을 적으세요");
			String col = scanner.nextLine();
			
			// 항목이 숫자형인지 확인
			boolean isNumericColumn = isNumericColumn(col);
			
			System.out.println("변경할 값");
			String change = scanner.nextLine();
			
//			 만약 숫자형 항목이라면, 입력값을 Int로 파싱
//			if (isNumericColumn) {
//				try {
//					Integer.parseInt(change);
//				} catch (NumberFormatException e) {
//					System.out.println("숫자 값을 입력하세요.");
//					return;
//				}
//			}
			
			System.out.println("수정할 항목의 empno");
			int empno = Integer.parseInt(scanner.nextLine());
			
			int result = 0;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Statement stmt = connection.createStatement();
				
				// 숫자형 항목이면 따옴표 없이 업데이트 쿼리 생성
				String sql;
				if (isNumericColumn) {
					sql = "update emp set " + col + " = " + change + " where empno =" + empno;
				} else {
					// 문자열 항목이면 따옴표로 감싸서 업데이트 쿼리 생성
					sql = "update emp set " + col + " = '" + change + "' where empno =" + empno;
				}
				
				System.out.println(sql);
				result = stmt.executeUpdate(sql);
				
				if (result == 1) {
					System.out.println("업데이트 성공");
				} else {
					System.out.println("업데이트 실패");
				}
			} catch (ClassNotFoundException e) {
				System.out.println("에러");
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static boolean isNumericColumn(String col) {
		// 숫자형 항목의 리스트를 여기에 추가하세요
		List<String> numericColumns = Arrays.asList("empno", "mgr", "sal", "comm", "deptno");
		return numericColumns.contains(col.toLowerCase());
	}

}