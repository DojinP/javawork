package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 모든 DB관련 메소드에서 공통으로 처리되는 부분 구현
 * - Connection 관리
 * - 자원반납 등
 * DB 연동과 관련된 기능을 유틸리티처럼 제공하는 클래스
 * 1. 드라이버로딩
 * 2. DB서버 연결
 * 3. 자원반납
 */
public class DBUtil {
	// 드라이버로딩 - DBUtil 클래스가 로딩될 때 자동으로 드라이버가 로딩되도록 작업
	// => static{} 에 정의한 코드는 DBUtil 클래스가 클래스로더에 의해 메모리에 로딩될 때 실행된다.
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	// DB서버에 연결하고 Connection을 리턴하는 메소드
	public static Connection getConnect() {
//		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String url = "jdbc:mysql://172.30.1.41:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 자원반납을 위한 메소드
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
