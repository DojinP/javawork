package api.lang;
// 일반클래스 - normal 클래스(POJO 클래스 : Plain Old Java Object)
public class Person {
	private String name;
	private String addr;
	private int age;
	public Person () {
		
	}
	
	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		// obj가 Person 타입인지 검사
//		if(obj instanceof Person p) {}	// 16버전에서 가능
		if(obj instanceof Person) {
			// 객체의 값을 비교해야하므로 Person의 멤버에 엑세스해야한다. 따라서 캐스팅해야한다.
			// instanceof 연산자로 타입을 체크했기 때문에 if 문 안에서 obj 변수를 따로 캐스팅하지 않고도 멤버를 접근할 수 있다.
			//  ㄴ 이전 버전에서는 불가능
			Person p = (Person)obj;
			if(this.name.equals(p.name) & this.addr.equals(p.addr) & this.age == p.age) {
				return true;
			}			
		}	
		
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

