package chap06;
// MyMethod 클래스에서 정의한 메소드를 사용하는 클래스
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("=====프로그램 시작=====");
		
		MyMethod obj = new MyMethod();
		
		// 1. 매개변수가 없고 리턴 값이 없는 메소드의 호출
		obj.display();
		System.out.println("++++++ step1 ++++++");
		obj.display();
		System.out.println("++++++ step2 ++++++");
		obj.display();
		
		// 2. 매개변수가 한 개, 리턴 값이 없는 메소드의 호출
		obj.display("★");
		obj.display("♡");
		obj.display("▨");
		
		// 3. 매개변수가 두 개, 리턴 값이 없는 메소드의 호출
		obj.display("★", 3);
		obj.display("♡", 2);
		obj.display("▨", 1);
		
		// 4. 매개변수와 리턴값이 모두 있는 메소드의 호출
		// ① 리턴 값이 있는 메소드를 호출하는 경우 리턴 값과 동일한 타입의 변수를
		//   선언해서 리턴 값을 저장한다.
		int result = obj.add(100, 200);
		System.out.println("result => " + result);
		if(result > 200) {
			System.out.println("result는 200 초과");
		}else {
			System.out.println("result는 200 이하");
		}
		// ② 메소드의 호출 결과를 다른 메소드의 매개변수로 전달할 수 있다.
		System.out.println(result);
		System.out.println(obj.add(500, 400));
	}
}
