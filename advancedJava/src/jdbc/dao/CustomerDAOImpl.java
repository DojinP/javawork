package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// MySQL 액세스하기 위한 기능 - customer 테이블에 대한 CLRUD를 정의
public class CustomerDAOImpl implements CustomerDAO {
	
	@Override
	public int insert(CustomerVO customer) {
//		System.out.println(customer);// 검증
		String sql = "insert into customer values(?,?,?,?,sysdate(),1000,?)";
		Connection conn = null;
		PreparedStatement ptmt = null;
		int result = 0;
		
		try {
			conn = DBUtil.getConnect();
			System.out.println("Connection");
			ptmt = conn.prepareStatement(sql);
			System.out.println("PreparedStatement:"+ptmt);
			// 외부에서 입력받아 처리하는 부분을 VO 객체에서 꺼내어 전달
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setString(4, customer.getAddr());
			ptmt.setString(5, customer.getMemo());
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
	public ArrayList<CustomerVO> select(String addr) {
		// 변환될 레코드를 담을 자료구조
		// 레코드를 하나로 
		ArrayList<CustomerVO> customerList = new ArrayList<CustomerVO>();
		// 레코드 하나를 담을 객체를 정의
		CustomerVO customer = null;
		
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
			System.out.println("ResultSet=>"+rs);
			// 테스트를 위해서 sysout해서 결과를 출력해봤지만 sysout은 의미가 없고
			// 조회한 레코드를 VO로 변환해서 ArrayList에 담는 작업을 처리
			while (rs.next()) {	// 레코드 탐색 : 다음 레코드로 커서를 내려서 레코드가 있으면 true, 없으면 false 리턴
				// 1. 조회한 레코드로 VO 객체 만들기
				customer = new CustomerVO(rs.getString(1),
										rs.getString(2),
										rs.getString(3),
										rs.getString(4),
										rs.getDate(5),
										rs.getInt(6),
										rs.getString(7));
				// 2. 레코드가 변환된 VO 객체를 ArrayList에 저장하기
				customerList.add(customer);
			}
			System.out.println("조회된 레코드 개수 : " + customerList.size());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		
		return customerList;
	}

	@Override
	public CustomerVO login(String id, String pass) {
		CustomerVO customer = null;
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
				customer = new CustomerVO(rs.getString(1),
											rs.getString(2),
											rs.getString(3),
											rs.getString(4),
											rs.getDate(5),
											rs.getInt(6),
											rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		
		return customer;
	}

	@Override
	public ArrayList<CustomerVO> getMemberList() {
		ArrayList<CustomerVO> customerList = new ArrayList<CustomerVO>();
		CustomerVO customer = null;
		
		String sql = "select * from customer";
		
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnect();
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while (rs.next()) {
				customer = new CustomerVO(rs.getString(1),
											rs.getString(2),
											rs.getString(3),
											rs.getString(4),
											rs.getDate(5),
											rs.getInt(6),
											rs.getString(7));
				customerList.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		
		return customerList;
	}

	@Override
	public CustomerVO getCustomerInfo(String id) {
		CustomerVO customer = null;
		String sql = "select * from customer where id = ?";

		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnect();
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, id);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				customer = new CustomerVO(rs.getString(1),
											rs.getString(2),
											rs.getString(3),
											rs.getString(4),
											rs.getDate(5),
											rs.getInt(6),
											rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, conn);
		}
		
		return customer;
	}

}
