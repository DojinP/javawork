package chap07.oop.inheritance;
// final
// 변수 -> 상수로 정의
// 메소드 -> 오버라이딩 할 수 없는 메소드
// 클래스 -> 상속할 수 없는 클래스

class A {
	public void test() {
		// 일반 메소드
	}
	
	public final void login(String pw) {
		// 보안이 필요한 너무나 중요한 메소드
		// ex) 비밀번호로 인증해서 금액을 인출하는 기능
		System.out.println("부모클래스의 중요한 메소드 - 인증하고 액세스하기");
	}
	
}

class B extends A {
	public void login(String pw) {
		System.out.println("인증하지 않고 액세스하는 코드로 수정");
	}
}
public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
