package chap07.oop.inheritance;

public class Student extends Person {
	private int id;
	
	public Student() {
		
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public void print() {
		super.print();
		System.out.println("   학   번 : " + id);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
