package chap06.oop.constructor;

public class Student {
	private String name;
	private int age;
	private int id;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void print() {
		System.out.println("이   름 : " + name + "   나 이 : " + age + "   학   번 : " + id);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
