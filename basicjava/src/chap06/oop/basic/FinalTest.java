package chap06.oop.basic;
//final은 클래스, 메소드, 변수 앞에 모두 사용할 수 있다.
public class FinalTest {
	// 변수 앞에 final 추가하면 상수 -> 변하지 않는 수
	public static final int MY_VAL = 10000;
	public static void main(String[] args) {
		final int NUM = 100;
		My_VAL = 2000;	// final 변수는 상수이므로 프로그램 중간에 값을 변경할 수 없다.
		NUM = 1000;
	}

}
