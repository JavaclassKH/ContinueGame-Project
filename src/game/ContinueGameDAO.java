package game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContinueGameDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String sql = "";
	ContinueGameVO vo = null;
	
	
	public ContinueGameDAO() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/javaclass";
			String user = "root";
			String password = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
				System.out.println("드라이버 오류 : " + e.getMessage());
		} catch (SQLException e) {
				System.out.println("데이터베이스 연동 오류 : " + e.getMessage());
		}
	}
	
	  //conn객체 닫기
		public void connClose() {
			try { conn.close(); } catch (SQLException e) {}
		}
	
		// pstmt객체 닫기
		public void pstmtClose() {
			try {
				if(pstmt != null)  pstmt.close();
			} catch (Exception e) {}
		}	
	
		// rs객체 닫기
		public void rsClose() {
			try {
				if(rs != null) {
					rs.close();
					pstmtClose();
				}
			} catch (Exception e) {}
		}

		// 속담앞부분출력, 정답검사
		public void SokdamPrint(String ans) {
			// TODO Auto-generated method stub
			
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

