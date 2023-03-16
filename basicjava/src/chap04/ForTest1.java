package chap04;
//for문의 기본문법을 연습하는 예제
public class ForTest1 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("자바프로그램:"+i);
		}
		System.out.println("=========================================");
		
		for(int i=10; i<=15; i++) {
			System.out.println("자바프로그램:"+i);
		}
		System.out.println("=========================================");
		
		for(int i=0; i<5; i++) {
			System.out.println("자바프로그램:"+i);
		}
		System.out.println("=========================================");
		
		for(int i=5; i>=1; i--) {
			System.out.println("자바프로그램:"+i);
		}
		System.out.println("*****************************************");
	}

}
