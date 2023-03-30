package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1/jdbc";
		String user = "exam";
		String password = "1234";
		//String sql = "select * from customer where id = 'jang' and pass = '1234'";
		String sql = "select * from customer where id = '' and pass = ''";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// System.out.println("드라이버 연결 완료.");

			Connection con = DriverManager.getConnection(url, user, password);
			// System.out.println("커넥션 완료.");

			Statement stmt = con.createStatement();
			// System.out.println("Statement 생성 완료.");

			ResultSet rs = stmt.executeQuery(sql);
			// System.out.println("쿼리 실행 완료.");

//			if(!rs.next()) {
//				System.out.println("로그인 실패.");
//			}else {
//				while (true) {
//					System.out.print(rs.getString(1) + "\t");
//					System.out.print(rs.getString(2) + "\t");
//					System.out.print(rs.getString(3) + "\t");
//					System.out.print(rs.getString(4) + "\t");
//					System.out.print(rs.getDate(5) + "\t");
//					System.out.print(rs.getInt(6) + "\t");
//					System.out.println(rs.getString(7));
//					
//					if(!rs.next()) {
//						break;
//					}
//				}
//			}
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
