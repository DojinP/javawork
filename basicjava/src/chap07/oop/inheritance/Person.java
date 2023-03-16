package chap07.oop.inheritance;

// Person 클래스를 만들어서 중복되는 내용 추가
// 나머지 클래스는 Person 클래스를 상속할 수 있도록 작업
// TestSchool.java 를 수정하지 않고 실행이 잘 되도록 작업

// 단 생성자는 수정하지 않음
//  Person 클래스의 멤버변수는 private을 지운다 (일단)
public class Person {
	private String name;
	private int age;

	public Person () {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.print("이   름 : " + name + "   나 이 : " + age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
