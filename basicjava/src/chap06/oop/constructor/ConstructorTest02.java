package chap06.oop.constructor;
// 생성자 테스트하기
public class ConstructorTest02 {
	public static void main(String[] args) {
		// 1. 컴파일러가 기본생성자를 제공 (생성자를 정의하지 않는 경우)
		Constructor obj = new Constructor();
		obj.setName("슈가");
		obj.setId("bts");
		obj.setPass("bts1234");
		// 2. 매개변수가 3개 정의된 생성자를 호출
		//   - constructor 객체를 생성하면서 Constructor 객체가 갖고있는 멤버변수를 초기화
		//     (name, id, pass)
		Constructor obj2 = new Constructor("장동건", "jang", "1234");
		
		System.out.println("성명:" + obj.getName());
		System.out.println("닉네임:" + obj.getNickname());
		
		System.out.println("================================================");
		
		System.out.println("성명:" + obj2.getName());
		System.out.println("닉네임:" + obj2.getNickname());
		
		System.out.println("================================================");

		Constructor obj3 = new Constructor("진", "bts", "bts1234", "서울", "010", "형", 1000);

		
		
	}
}
