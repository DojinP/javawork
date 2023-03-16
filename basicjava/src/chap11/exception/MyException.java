package chap11.exception;
// 사용자정의 예외클래스를 만들기
// => is a 관계 = 상속관계
// => has a 관계 = 멤버변수로 선언
// MyException을 Exception 클래스로 만들기 위해서 상속한다.
public class MyException extends Exception {
	public MyException(String msg) {
		super(msg);	// Exception 클래스에 메시지 전달
	}
}
