package jdbc.exam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAOImpl implements BoardDAO{
	
	@Override
	public int insert(BoardVO board) {
		Connection conn = null;
		PreparedStatement ptmt = null;
		String sql = "insert into tb_board values (null, ?, ?, ?, sysdate(), 0)";
		int result = 0;
		try {
			conn = DBUtil.getConnection();
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, conn);
		}
		return result;
	}
	/*
	 * @Override public int insert(String id, String title, String content) {
	 * Connection conn = null; PreparedStatement ptmt = null; String sql =
	 * "insert into tb_board values (null, ?, ?, ?, sysdate(), 0)"; int result = 0;
	 * 
	 * conn = DBUtil.getConnection(); try { ptmt = conn.prepareStatement(sql);
	 * 
	 * ptmt.setString(1, id); ptmt.setString(2, title); ptmt.setString(3, content);
	 * 
	 * result = ptmt.executeUpdate();
	 * 
	 * System.out.println(result + "행 삽입 완료");
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } finally {
	 * DBUtil.close(null, ptmt, conn); }
	 * 
	 * return result; }
	 */

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
	public ArrayList<BoardVO> select() {
		ArrayList<BoardVO> boardList = new ArrayList<>();
		BoardVO board = null;
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board";
		
		try {
			conn = DBUtil.getConnection();
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				board = new BoardVO(rs.getInt(1), 
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getDate(5),
									rs.getInt(6));
				boardList.add(board);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		return boardList;
	}

	@Override
	public BoardVO read(int boardNum) {
		BoardVO board = null;
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board where boardNum = ?";
		
		try {
			conn = DBUtil.getConnection();
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, boardNum);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardVO(rs.getInt(1), 
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getDate(5),
									rs.getInt(6));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		return board;
	}

	@Override
	public ArrayList<BoardVO> search(String title) {
		ArrayList<BoardVO> boardList = new ArrayList<>();
		BoardVO board = null;
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board where title like ?";
		
		try {
			conn = DBUtil.getConnection();
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, "%"+title+"%");
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				board = new BoardVO(rs.getInt(1), 
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getDate(5),
									rs.getInt(6));
				boardList.add(board);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		return boardList;
	}

}
