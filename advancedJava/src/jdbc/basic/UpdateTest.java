package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "exam";
		String pw = "1234";
		String sql = "update customer set addr = '서울특별시' where addr = '서울'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading 성공.");
			
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("DB Connection 성공 : " + conn );
			
			Statement stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + "개 행 수정 성공.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}

}
