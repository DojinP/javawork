package chap06;
// 자바의 특성에 맞게 정의된 클래스를 사용
public class PersonTest2 {
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		
		// setter 메소드 호출하기
		p1.setName("제이홉");
		p1.setAddr("서울시");
		p1.setAge(20);
		
		// getter 메소드 호출하기
		System.out.println("성명:"+p1.getName());
		System.out.println("주소:"+p1.getAddr());
		System.out.println("나이:"+p1.getAge());
		
		// Person2 객체를 생성하고
		// setter 메소드를 호출하여 값을 세팅한다.
		// 지민, 인천시, 25
		Person2 p2 = new Person2();
		
		p2.setName("지민");
		p2.setAddr("인천시");
		p2.setAge(25);
		
		// 셋팅된 객체의 값을 출력해보기
		System.out.println("성명:"+p2.getName());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("나이:"+p2.getAge());
	}
}
