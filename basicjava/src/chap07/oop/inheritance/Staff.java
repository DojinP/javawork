package chap07.oop.inheritance;

public class Staff extends Person {
	private String dept;
	
	public Staff() {
		
	}
	
	public Staff(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		System.out.println("   부   서 : " + dept);
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
