package chap06.oop.basic;

import java.util.Random;

// 메소드의 매개변수, 리턴타입으로 클래스를 정의하고 사용할 수 있다.
// 				  ------
//				  API에 정의된 클래스, 사용자정의 클래스
public class MethodArgTest {
	public static void main(String[] args) {
		Random rand = new Random();
		MethodArgTest obj = new MethodArgTest();
		// Person2 객체는 참조하는 변수 없이 바로 생성해서 매개변수로 전달
		obj.test(rand, new Person2());
		Person2 p = obj.test2();
		System.out.println(p.getName());
		System.out.println(p.getAddr());
	}
	
	// 메소드의 매개변수로 클래스를 정의하고 사용
	public void test(Random rand2, Person2 p1) {
		System.out.println("=====test=====");
		System.out.println(p1.getName());
	}
	
	// 메소드의 리턴타입으로 클래스를 정의하고 사용
	
	public Person2 test2() {
		System.out.println("=====test2=====");
		Person2 p = new Person2();
		p.setName("장동건");
		p.setAddr("서울");
		return p;
	}

}
