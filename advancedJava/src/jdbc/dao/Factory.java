package jdbc.dao;

// 객체를 관리하는 역할
public class Factory {
	public CustomerDAO getDao() {
		return new CustomerDAOImpl_JSON();
	}
}
