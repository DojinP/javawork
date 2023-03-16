package prob.object.basic;
// 기본객체 Ex01
public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnfee;
	
	public Student(String name, String subject, int fee) {
		super();
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	
	public static void main(String args[]) {
		Student stu = new Student("장동건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
	
	public void calcReturnFee() {
		if(this.subject == "javaprogram") {
			this.returnfee = fee * 0.25;
		}else if(this.subject == "jspprogram") {
			this.returnfee = fee * 0.2;
		}else {
			System.out.println("그런 과정명은 없습니다.");
		}
	}
	
	public void print()	{
		System.out.println(name + "씨의 과정명은 " + subject + "이고 교육비는 " + fee + "이며 환급금은 " + returnfee + "입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}
