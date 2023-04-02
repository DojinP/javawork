package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		String sql = "insert into customer values(?,?,?,?,sysdate(),1000,?)";
		Connection conn = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			conn = DBUtil.getConnect();

			ptmt = conn.prepareStatement(sql);

			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);

			result = ptmt.executeUpdate();

			System.out.println(result + "개 행 삽입 성공.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		
		return result;
	}

	@Override
	public int update(String id, int point, String pass) {
		String sql = "update customer set point = ?, pass = ? where id = ?";
		Connection conn = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			conn = DBUtil.getConnect();
			
			ptmt = conn.prepareStatement(sql);

			ptmt.setInt(1, point);
			ptmt.setString(2, pass);
			ptmt.setString(3, id);

			result = ptmt.executeUpdate();

			System.out.println(result + "개 행 수정 성공.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		return result;
	}

	@Override
	public int delete(String id) {
		String sql = "delete from customer where id = ?";
		Connection conn = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			conn = DBUtil.getConnect();

			ptmt = conn.prepareStatement(sql);

			ptmt.setString(1, id);

			result = ptmt.executeUpdate();

			System.out.println(result + "개 행 삭제 성공.");
						

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		
		return result;
	}

	@Override
	public void select(String addr) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * ");
		sql.append("from customer ");
		sql.append("where addr like ?");

		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnect();

			ptmt = conn.prepareStatement(sql.toString());

			ptmt.setString(1, "%" + addr + "%");

			rs = ptmt.executeQuery();

			// 5. 결과에 대한 처리
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
	}

	@Override
	public void login(String id, String pass) {
		String sql = "select * from customer where id = ? and pass = ?";

		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnect();
			ptmt = conn.prepareStatement(sql);

			ptmt.setString(1, id);
			ptmt.setString(2, pass);

			rs = ptmt.executeQuery();

			if (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.println(rs.getString(7));
			} else {
				System.out.println("로그인 실패.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
	}
}
