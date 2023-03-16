package chap06.oop.basic;
//static 메소드의 특징과 static 블럭
public class StaticMethodDemo {
	static int staticNum;
	static {
		staticNum = 100;
		System.out.println("static 블럭 - 클래스가 로딩될 때 한 번 실행하는 코드를 정의할 목적으로 사용");
		System.out.println("static 블럭 - 자원에 대한 정보를 한 번 인식시키거나 액세스할 필요가 있는 경우 사용");
		System.out.println("static 블럭 - 클래스가 로딩될 때 한 번만 실행되므로 static변수의 값을 초기화할 목적으로 사용하기도 한다.");
		
		}
	
	
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo의 기본생성자");
	}
	
	//===== 메소드가 선언된 클래스 내부에서 메소드 호출하
	
	public static void test() {	// 클래스 메소드
		// 1. static 메소드에서 static 메소드 호출하기
		//   - 일반적인 방법으로 접근하기
		//	   ----------
		//	   자신의 클래스 내부에 선언된 메소드는 메소드명만 입력하여 호출할 수 있다.
		show();
		System.out.println("test");
	}
	
	public void display() {		// 인스턴스 메소드
		// 2. non-static 메소드에서 non-static 메소드를 호출
		//   - 일반적인 방법으로 호출 가능
		change();
		System.out.println("display");
	}
	// static 메소드는 static 멤버변수의 값을 조작하거나
	// 유틸리티처럼 메소드를 편하게 사용하기 위한 목적
	// ------------------------------------
	// 자원을 액세스하거나 모든 객체에서 공통으로 사용하는
	// 기능을 표현하는 경우 사용
	public static void show() {	// static 메소드 (클래스 메소드)
		// 4. static 메소드에서 non-static 메소드를 호출
		// show 메소드가 메모리에 있는 상태에서 바로 examtest를 확인할 수 없으므로 에러 발생
		// 같은 클래스 내부에 선언되어있는 메소드라고 하더라도 static에서 non-static 메소드를
		// 호출하는 경우
		// 객체생성 후 참조변수를 통해 호출
		examtest();
		System.out.println("show");
	}
	
	public void change() {		// non-static 메소드 (인스턴스 메소드)
		// 3. non-static 메소드에서 static 메소드 호출
		show();
		System.out.println("change");
	}
	
	public void examtest() {
		System.out.println("examtest");
	}
}
