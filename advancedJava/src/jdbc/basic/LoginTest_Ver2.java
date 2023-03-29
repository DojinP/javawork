package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginTest_Ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginTest_Ver2 obj = new LoginTest_Ver2();
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pass = sc.next();
		
		obj.login(id, pass);
	}

	public void login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1/jdbc";
		String user = "exam";
		String password = "1234";
		String sql = "select * from customer where id = '" + id + "' and pass = '" + pass + "'";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

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
