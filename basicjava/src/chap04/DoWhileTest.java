package chap04;

public class DoWhileTest {
	public static void main(String[] args) {
		// while문은 조건이 만족하지 않으면 블럭 안의 명령문을 한 번도 실행하지 않는다
		int i=0;
		
		
		// do while 문은 조건이 만족하지 않아도 한 번은 블럭 안의 코드가 실행된다.	
		while(i<10) {
			System.out.println("while"+i);
			i++;
		}
		
		do {
			System.out.println("while");
			i++;
		}while(i<10);
	}
}
