package chap06;
// 메소드 정의를 연습하기 위한 클래스
public class MyMethod {
	// 4. 매개변수, 리턴 값이 모두 있는 메소드
	//    - 숫자 2개를 매개변수로 전달받아서 더한 후 결과를 리턴하는 메소드
	//    - 메소드 선언부에 리턴 타입을 정의하는 경우,
	//	    무조건 메소드의 마지막 문장에서 결과 값을 리턴해야 한다.
	public int add (int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	// 3. 리턴 값이 없고 매개변수가 두 개인 메소드 (직접 해보기)
	//    - 출력할 기호와 출력할 횟수를 전달받아서 구현하고,
	//		MyMethod.java 에서 호출하여 사용하기
	//	  - 메소드명:display
	public void display(String str, int count) {
		for(int i=1; i<=count; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	// 2. 리턴 값이 없고 매개변수가 한 개인 메소드
	public void display(String str) {
		for(int i=1; i<=10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	// 1. 매개변수가 없고 리턴 값이 없는 메소드
	public void display() {
		for(int i=1; i<=10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
