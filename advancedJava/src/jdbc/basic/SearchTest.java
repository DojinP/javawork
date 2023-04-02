package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1/jdbc";
		String user = "exam";
		String password = "exam";
		String sql = "select empno, ename, job, mgr, hiredate, sal from emp ";
				sql += "where sal > (select avg(sal) ";
				sql += "             from emp ";
				sql += "             where deptno = 10)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// System.out.println("드라이버 연결 완료.");
			Connection con = DriverManager.getConnection(url, user, password);
			// System.out.println("커넥션 완료.");
			Statement stmt = con.createStatement();
			// System.out.println("Statement 생성 완료.");
			ResultSet rs = stmt.executeQuery(sql);
			// System.out.println("쿼리 실행 완료.");

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.println(rs.getInt(6) + "\t");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
