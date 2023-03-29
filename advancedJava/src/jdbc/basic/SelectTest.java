package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String user = "exam";
		String password = "1234";
//		StringBuffer sql = new StringBuffer();
//		sql.append("select * ");
//		sql.append("from customer ");
//		String sql = "select name, id, pass from customer";
		String sql = "select * from customer";
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
			
			// 4. select 문 실행
			ResultSet rs = stmt.executeQuery(sql.toString());
			System.out.println("ResultSet = " + rs);
			
			// 5. 결과에 대한 처리
			while(rs.next()) {	// record 탐색 : 다음 record로 cursor를 내려서 record가 존재하면 true, 아니면 false
				System.out.print(rs.getString("id") + "\t");
//				System.out.println(rs.getString(1));	// 컬럼 순서 index는 1부터 시작 ("id") 의미 (ResultSet(조회결과)의 테이블을 기준)
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
