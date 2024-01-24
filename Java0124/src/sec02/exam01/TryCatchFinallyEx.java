package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchFinallyEx {

	public static void main(String[] args) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {//e는 변수이름임 암거나 해도 댐 Exception으로 대부분 예외처리 해도 되지만
												// 그거보다는 구체적으로 사용하는게 좋음
				System.out.println("error");
				System.exit(0); // 나머지 다 버리고 나가버림
//				e.printStackTrace(); //오류내용 보여주는거
			} finally {//catch 걸려도 실행
				System.out.println("반드시 실행");
			}
			try {
				Connection connection = DriverManager.getConnection(null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}


}
