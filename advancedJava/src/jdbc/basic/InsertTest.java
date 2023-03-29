package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "exam";
		String password = "1234";
		String sql = "insert into customer values('bts', '1234', '방탄소년단', '천안', sysdate(), 1000, 'army')";
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading 성공.");
			
			// 2. DB서버 접속
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connection 성공 : " + conn );
			
			// 3. SQL을 실행하기 위해서 Statement 객체를 생성
			Statement stmt = conn.createStatement();
			System.out.println("Statement 객체 : " + stmt);
			
			// 4. SQL 문을 실행
			int result = stmt.executeUpdate(sql);
			
			// 5. 결과처리
			System.out.println(result + "개 행 삽입 성공.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
