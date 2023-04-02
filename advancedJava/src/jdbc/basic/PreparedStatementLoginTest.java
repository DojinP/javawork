package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementLoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatementLoginTest obj = new PreparedStatementLoginTest();
		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("PW : ");
		String pass = sc.next();
		
		obj.login(id, pass);
	}

	public void login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1/jdbc?serverTimezone=UTC";
		String user = "jdbc";
		String password = "jdbc";
		String sql = "select * from customer where id = ? and pass = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			
			ResultSet rs = ptmt.executeQuery();

			if(rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7));
			}else {
				System.out.println("로그인 실패.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
