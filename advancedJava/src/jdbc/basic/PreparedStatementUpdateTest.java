package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatementUpdateTest obj = new PreparedStatementUpdateTest();
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("변경할 Point : ");
		int point = sc.nextInt();
		System.out.print("변경할 Password : ");
		String pass = sc.next();
				
		obj.update(id, point, pass);
	}
	
	public void update(String id, int point, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc?serverTimezone=UTC";
		String user = "jdbc";
		String password = "jdbc";
		String sql = "update customer set point = ?, pass = ? where id = ?";
		System.out.println(sql);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading 성공.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connection 성공 : " + conn );
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setInt(1, point);
			ptmt.setString(2, pass);
			ptmt.setString(3, id);
			
			int result = ptmt.executeUpdate();
			
			System.out.println(result + "개 행 수정 성공.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
