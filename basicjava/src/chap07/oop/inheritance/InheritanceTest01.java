package chap07.oop.inheritance;
/*
 * <<상속관계에서 멤버변수가 갖는 특징>>
 * 1. 상속관계에서 상위 클래스에 선언된 멤버변수는 하위 클래스에서 접근 가능
 * 2. 상위 클래스에서 선언된 변수와 동일한 이름의 멤버변수를 하위 클래스에 정의하면 
 * 부모클래스의 멤버변수보다 하위클래스의 멤버변수가 우선순위가 높다.
 * 3. 하위 클래스에서 상위 클래스의 멤버를 접근(액세스,호출,사용)하고 싶다면 super 키워드를 이용해서 접근
 * 							 ----
 * 							멤버변수(필드), 메소드
 * 	this -> 자기자신의 객체
 * 	super -> 부모 객체	
 */
class Super{
	private int num = 10;
}

class Sub extends Super {
	int num = 100;
	public void display() {
		System.out.println("num => "+ num);
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.display();
		System.out.println(obj.num);
	}

}
