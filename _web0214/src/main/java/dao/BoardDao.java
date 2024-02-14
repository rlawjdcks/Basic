package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {
	private static Connection conn;
	private static BoardDao dao = new BoardDao();
	private BoardDao() {} // 생성자
	public static BoardDao getInstance() {
		getConnection();
		return dao;
	}
	
	private static void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<Board>();
		String sql = "select * from board order by num desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), 
						rs.getString("title"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	public Board selectOne(int num, boolean inc) {
		String sql = "select * from board where num=" + num;
		//String sql = "select * from board where num= ?";
		PreparedStatement pstmt;
		ResultSet rs = null;
		Board board = null; // Board 객체 생성
		try {
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, num); 이게 정석
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("writer"),
	                    rs.getString("title"), rs.getString("content"),
	                    rs.getString("regtime"), rs.getInt("hits"));
			}
			if (inc) {
				pstmt.executeUpdate("update board set hits = hits + 1 where num="+num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public int delete(int num) {
		String sql = "delete from board where num=" + num;
		PreparedStatement pstmt;
		int rs = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int insert(Board board) {
		 String curTime = LocalDate.now() + " " + 
		            LocalTime.now().toString().substring(0, 8);
		String sql = (String.format(
                "insert into board " + 
                "(writer, title, content, regtime, hits)" + 
                "values ('%s', '%s', '%s', '%s', 0)",
                "?, ?, ?, ?"));
		PreparedStatement pstmt;
		int rs = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "writer");
			pstmt.setString(2, "title");
			pstmt.setString(3, "content");
			pstmt.setString(4, "curTime");
			rs = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public int update(Board board) {
		
		return 0;
	}
}