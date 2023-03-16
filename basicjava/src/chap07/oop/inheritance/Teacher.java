package chap07.oop.inheritance;

public class Teacher extends Person {
	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.println("   담당과목 : " + subject);
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}	
}
