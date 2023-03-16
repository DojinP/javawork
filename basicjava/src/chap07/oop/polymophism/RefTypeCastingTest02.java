package chap07.oop.polymophism;
// 객체의 형변환
// 사용자정의 클래스
class Super{
	String data = "상위클래스";
	public void display() {
		System.out.println("super display");
	}
}

class Sub extends Super {
	String data = "하위클래스";
	public void display() {
		System.out.println("sub display");
	}
	public void test() {
		System.out.println("sub test");
	}
}

public class RefTypeCastingTest02 {
	public static void main(String[] args) {
		System.out.println("1. Super 타입의 참조변수로 Super 객체를 사용");
		Super obj1 = new Super();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("***************************************");
		
		System.out.println("2. Sub 타입의 참조변수로 Sub 객체를 사용");
		Sub obj2 = new Sub();
		obj2.display();	// 상속관계에서 오버라이딩된 메소드가 있으면 부모 메소드가 아닌 자식 메소드가 호출됨
		System.out.println(obj2.data); // 부모의 변수와 동일한 변수가 정의된 경우에는 부모 변수가 아니라 자신 클래스의 변수가 인식됨
		
		System.out.println("***************************************");
		System.out.println("3. Super 타입의 참조변수로 Sub 객체를 사용");
		//자동형변환
		//참조형변수가 Super 타입이므로 Super의 멤버만 접근할 수 있다.
		// 규칙 3가지
		//1. new Sub가 가능한 이유는 Sub가 Sub의 멤버와 Super의 멤버 모두를 갖고 있기 때문에 가능
		Super obj3 = new Sub();
		System.out.println(obj3.data);
		//2. Super 타입이라 하더라도 오버라이딩 된 메소드가 있으면 무조건 오버라이딩된 메소드가 호출된다.
		obj3.display();
		
		
		
		//obj3은 Super 타입이기 때문에 Super의 멤버만 접근 가능		
		//3. Super 타입의 obj3이 실제로 참조하는 객체는 Sub 타입이므로 변수를 Sub 타입으로 명시적 캐스팅이 가능하다. (중요)
		//obj3을 Sub 타입으로 변경
		((Sub)obj3).test();
		
		
		System.out.println("***************************************");
		System.out.println("4. Sub 타입의 참조변수로 Super 객체를 사용");
		
		//실제 사용되는 변수타입에 대한 정보가 생성되는 객체에 없기 때문에 사용할 수 없다.
		//Sub obj4 = new Super(); ---------------- X
		
		System.out.println("***************************************");
		System.out.println("5. Sub 변수 = Super 객체를 참조하는 변수");
		
		//명시적으로 캐스팅하면 컴파일러는 속일 수 있으나(상속관계에 있어야만 속는다.)
		//obj1이 참조하는 객체가 Super 이므로 실행할 때 캐스팅 오류가 발생한다.
		//Sub obj5 = obj1; // Sub obj5 = new Super();
		Sub obj5 = (Sub)obj1;
		
		System.out.println("***************************************");
		System.out.println("5. Sub 변수 = Sub 객체를 참조하는 Super 변수");
		//obj3 은 Super 타입이므로 자동캐스팅은 불가능하나
		//obj3 을 명시적으로 캐스팅하면 실제 obj3이 참조하는 객체는 Sub이므로 캐스팅이 가능
		//Sub obj6 = obj3;
		Sub obj6 = (Sub)obj3;
	}
}
