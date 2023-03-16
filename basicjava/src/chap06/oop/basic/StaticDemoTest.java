package chap06.oop.basic;
// static변수(클래스변수, 정적변수..)를 테스트하기 위한 클래스
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		// num 변수와 staticNum 변수는 다른 개념(StaticDemo.java 참고)의 변수이므로
		// 사용방법이 다르다.
		// num과 같은 인스턴스 변수는 객체참조변수를 통해서 사용이 가능하지만
		// staticNum과 같은 static 변수는 객체의 소유가 아니라 클래스에 정의된 공통변수이므로
		// 클래스명으로 액세스한다.
		// 클래스명.변수
		System.out.println("main==>"+obj1.num +","+StaticDemo.staticNum);
		
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		System.out.println("main==>"+obj2.num +","+StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		System.out.println("main==>"+obj3.num +","+StaticDemo.staticNum);
		
		// API 에서 확인할 수 있는 static 변수도 동일한 방법으로 접근해서 사용한다.
		System.out.println(Math.PI);
	}
}
