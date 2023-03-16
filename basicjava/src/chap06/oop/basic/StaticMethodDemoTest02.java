package chap06.oop.basic;
public class StaticMethodDemoTest02 {

	public static void main(String[] args) {
		StaticMethodDemo obj = new StaticMethodDemo();
		StaticMethodDemo obj2 = new StaticMethodDemo();
		StaticMethodDemo obj3 = new StaticMethodDemo();
		
		//===== 외부클래스에서 호출 =====
		//클래스메소드의 호출 => 클래스명.메소드명()
		StaticMethodDemo.test();
		//인스턴스메소드의 호출 => 객체명.메소드명()
		obj.change();
		StaticMethodDemoTest02 m = new StaticMethodDemoTest02();
		display();
	}
	public void display() {
		System.out.println("display()");
	}
}
