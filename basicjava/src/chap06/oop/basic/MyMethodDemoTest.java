package chap06.oop.basic;

public class MyMethodDemoTest {

	public static void main(String[] args) {
		MyMethodDemo m = new MyMethodDemo();
		
		// ForExam_GuGu
		System.out.println("ForExam_GuGu");
		m.printGuGu(5);
		
		// GuGuExam
		System.out.println("GuGuExam");
		m.printGuGu();
		
		// Calc
		System.out.println("Calc");
		System.out.println(m.calc('+', 500, 300));
		
	}

}
