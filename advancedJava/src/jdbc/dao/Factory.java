package jdbc.dao;
// Factory의 역할을 하는 디자인 패턴
// => 객체를 만들어서 필요한 곳으로 넘겨주는 역할

// 객체를 관리하는 역할
public class Factory {
	public CustomerDAO getDao() {
		return new CustomerDAOImpl_JSON();
	}
}
