package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatementInsertTest obj = new PreparedStatementInsertTest();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String pass = sc.next();
		System.out.print("성명 : ");
		String name = sc.next();
		System.out.print("주소 : ");
		String addr = sc.next();
		System.out.print("메모 : ");
		String memo = sc.next();
		
		obj.insert(id, pass, name, addr, memo);
	}
	
	public void insert(String id, String pass, String name, String addr, String memo) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		// 2) SQL문의 외부에서 입력받을 부분을 ?로 표시
		String sql = "insert into customer values(?,?,?,?,sysdate(),1000,?)";
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading 성공.");
			
			// 2. DB서버 접속
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connection 성공 : " + conn );
			
			// 3. SQL을 실행하기 위해서 Statement 객체를 생성
			// 1) SQL문을 전달하면서 객체를 생성
			PreparedStatement ptmt = conn.prepareStatement(sql);
			System.out.println("PreparedStatement 객체 : " + ptmt);
			
			// 3) ?에 값 지정하기
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
			
			// 4. SQL 문을 실행 - PreparedStatement를 사용하는 경우 sql을 메소드의 매개변수로 전달하지 않는다.
			int result = ptmt.executeUpdate();
			
			// 5. 결과처리
			System.out.println(result + "개 행 삽입 성공.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
