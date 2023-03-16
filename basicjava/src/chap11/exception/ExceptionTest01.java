package chap11.exception;

import java.io.FileReader;
import java.util.Scanner;

// 프로그램 실행 중에 예외가 발생하는 상황

class Super{}

class Sub extends Super{}

public class ExceptionTest01 {
	public static void main(String[] args) {
		// 1.개발자가 실수할 수 있는 부분
		System.out.println("프로그램 시작");
		// System.out.println(10/0); 	// ArithmeticException
		// System.out.println(args[0]); // ArrayIndexOutOfBoundsException
		String str = null;
		// str.length(); 				// NullPointerException
		Super obj = new Super();
		// Sub obj1 = (Sub)obj; 		// ClassCastException
		System.out.println("======================================");
		
		// 2. 외부요인이나 사용자의 실수로 발생할 수 있는 오류
		Scanner key = new Scanner(System.in);
		System.out.print("값 입력: ");	 
		int data = key.nextInt(); 		// int 값 아닐 시 - InputMismatchException
		System.out.println("입력한 데이터=>" + data);
		
		// 3. API에서 문법적으로 예외처리를 요구하는 경우
		// 	  => 메소드 선언부에 ㅇㅇㅇException 을 throw 하는 것은 이 메소드를 사용하면서 ㅇㅇㅇㅇException이 발생될 수 있다는 의미
		//    => RuntimeException의 하위는 문법적으로 제약하지 않는다. 그러나 RuntimeException의 하위가 아닌 경우는 컴파일 오류가 발생하므로
		//		 예외처리를 해야 한다.
		//    => 예외가 발생할 가능성이 있는 코드이므로 무조건 예외처리를 해야한다.
		FileReader fr = new FileReader("text.txt");
		Integer.parseInt("1234");
	}
}
