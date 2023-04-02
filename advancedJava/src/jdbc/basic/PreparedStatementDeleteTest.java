package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDeleteTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatementDeleteTest obj = new PreparedStatementDeleteTest();
		System.out.print("삭제할 id 입력 : ");
		String id = sc.next();
		obj.delete(id);
	}
	
	public void delete(String id) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "jdbc";
		String password = "jdbc";
		String sql = "delete from customer where id = ?";
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading 성공.");
			
			// 2. DB서버 접속
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connection 성공 : " + conn );
			
			// 3. SQL을 실행하기 위해서 Statement 객체를 생성
			PreparedStatement ptmt = conn.prepareStatement(sql);
			System.out.println("Statement 객체 : " + ptmt);
			
			// 3-1) ptmt 값 지정
			ptmt.setString(1, id);
			
			// 4. SQL 문을 실행
			int result = ptmt.executeUpdate();
			
			// 5. 결과처리
			System.out.println(result + "개 행 삭제 성공.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
