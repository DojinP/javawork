package jdbc.exam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDAOImpl implements BoardDAO{

	@Override
	public int insert(String id, String title, String content) {
		Connection conn = null;
		PreparedStatement ptmt = null;
		String sql = "insert into tb_board values (null, ?, ?, ?, sysdate(), 0)";
		int result = 0;
		
		conn = DBUtil.getConnection();
		try {
			ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			
			result = ptmt.executeUpdate();
			
			System.out.println(result + "행 삽입 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		
		return result;
	}

	@Override
	public int update(String id, int boardNum, String title, String content) {
		Connection conn = null;
		PreparedStatement ptmt = null;
		String sql = "update tb_board set title = ?, content = ? where id = ? and boardNum = ?";
		int result = 0;
		
		conn = DBUtil.getConnection();
		
		try {
			ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1, title);
			ptmt.setString(2, content);
			ptmt.setString(3, id);
			ptmt.setInt(4, boardNum);
			
			result = ptmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		
		return result;
	}

	@Override
	public int delete(int boardNum) {
		Connection conn = null;
		PreparedStatement ptmt = null;
		String sql = "delete from tb_board where boardNum = ?";
		int result = 0;
		
		conn = DBUtil.getConnection();
		
		try {
			ptmt = conn.prepareStatement(sql);
			
			ptmt.setInt(1, boardNum);
			
			result = ptmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		
		return result;
	}

	@Override
	public void search(String title) {
		
	}

	@Override
	public void read(int boardNum) {
		
	}

}
