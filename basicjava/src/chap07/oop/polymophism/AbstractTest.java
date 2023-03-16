package chap07.oop.polymophism;
/*
 * 추상클래스
 *   => 객체를 생성할 수 없는 클래스, 미완성된 클래스
 *  	내용이 구현되어있지 않은 메소드를 포함하는 클래스를 추상클래스라고 한다.
 *      -------------------------
 *      추상메소드(body가 없는 메소드)
 *      
 *      1) 추상메소드를 선언하는 방법
 *         접근제어자 abstract 리턴타입 메소드명(매개변수1, 매개변수2, ...);
 *         왜?? 추상메소드를 사용하는 것인가??
 *      
 *      2) 추상클래스의 특징
 *         - 추상메소드가 하나라도 정의되어있는 클래스라면 추상클래스가 된다. 따라서 추상클래스는 선언부에 abstract 키워드를 추가해야한다.
 *         - 추상클래스에는 추상메소드와 일반메소드를 모두 정의할 수 있다.
 *         - 추상클래스는 객체생성을 할 수 없는 클래스
 *           => Child 클래스가 Parent를 상속받는다.
 *              Parent의 모든 멤버가 Child의 소유가 된다.
 *              Child 는 Parent의 일반메소드인 test와 추상메소드인 display를 모두 소유하므로 Child도 추상클래스가 된다.
 *              
 *           [에러 처리]
 *           ① Child 클래스 앞에 abstract 키워드 추가
 *           ② Child가 갖고있는 추상메소드를 구현
 *           
 *         - abstract 클래스는 상위클래스로 사용하기 위해서(상위클래스로 사용할 목적으로 정의되며 실제 타입으로만 사용된다.)
 *         - abstract 메소드는 하위클래스에서 반드시 오버라이딩되어야한다는 것을 문법적으로 제시
 */
abstract class Parent{
	public void test() {
		System.out.println("일반메소드");
	}
	//추상메소드
	public abstract void display(String msg);
}

class Child extends Parent{
	//컴파일러에 정보를 알려주는 작업
	//@Override 는 컴파일러에게 오버라이딩 된 메소드라는 것을 알려주는 기호
	public void display(String msg){
		System.out.println("display : " + msg);
	}
}

public class AbstractTest {
	public static void main(String[] args) {
		//Parent obj = new Parent();
		Parent obj = new Child();
		obj.display("aaa");
	}
}
