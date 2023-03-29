package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest_Ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UpdateTest_Ver2 obj = new UpdateTest_Ver2();
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("변경할 Point : ");
		int point = sc.nextInt();
		System.out.print("변경할 Password : ");
		String pass = sc.next();
				
		obj.update(id, point, pass);
	}
	
	public void update(String id, int point, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "exam";
		String pw = "1234";
		String sql = "update customer set point = " + point + ", pass = '" + pass + "' where id = '"+ id +"'";
		System.out.println(sql);
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
