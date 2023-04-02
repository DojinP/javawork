package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest_Ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InsertTest_Ver2 obj = new InsertTest_Ver2();
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
		String sql = "insert into customer values('" + id + "', '" + pass + "', '" + name +"', '" + addr + "', sysdate(), 1000, '" + memo + "')";
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
