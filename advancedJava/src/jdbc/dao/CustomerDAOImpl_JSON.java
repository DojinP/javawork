package jdbc.dao;

public class CustomerDAOImpl_JSON implements CustomerDAO{

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		// TODO Auto-generated method stub
		System.out.println("json에 insert");
		return 0;
	}

	@Override
	public int update(String id, int point, String pass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select(String addr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
