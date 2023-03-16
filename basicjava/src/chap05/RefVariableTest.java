package chap05;
// 참조형변수의 특징
public class RefVariableTest {

	public static void main(String[] args) {
		// 기본형변수는 0으로 초기화
		// 참조형변수는 null로 초기화
		int num = 0;
		// 변수가 선언되는 시점이 아니라 실행하면서 객체를 생성하는 경우 초기값을 null로 할당한다
		String str = null;	// str 참조변수는 어떤 객체도 참조하고 있지 않다. (주소 값이 아직 저장되지 않은 참조변수)
		// str 변수는 아직 객체를 참조하고 있지 않지만 타입이 String 이므로 컴파일러가 오류라고 인지하지 않음
		str.length();
		
		// 자바에서는 실행중에 나오는 오류를 Exception이라고 한다. ex) NullPointerException
	}

}
