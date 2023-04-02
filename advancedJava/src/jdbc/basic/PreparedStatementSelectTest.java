package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSelectTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatementSelectTest obj = new PreparedStatementSelectTest();
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.next();
		obj.select(addr);
		
	}

	public void select(String addr) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "jdbc";
		String password = "jdbc";
		StringBuffer sql = new StringBuffer();
		sql.append("select * ");
		sql.append("from customer ");
		sql.append("where addr like ?");
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading 성공.");
			
			// 2. DB서버 접속
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connection 성공 : " + conn );
			
			// 3. SQL을 실행하기 위해서 Statement 객체를 생성
			PreparedStatement ptmt = conn.prepareStatement(sql.toString());
			System.out.println("Statement 객체 : " + ptmt);
			
			ptmt.setString(1, "%"+addr+"%");
			System.out.println("Statement 객체 : " + ptmt);

			// 4. select 문 실행
			ResultSet rs = ptmt.executeQuery();
			System.out.println("ResultSet = " + rs);
			
			// 5. 결과에 대한 처리
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
