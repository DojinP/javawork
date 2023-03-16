package chap11.exception;

import java.util.Scanner;

// 사용자정의 Exception을 사
public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("프로그램 시작");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.print("숫자입력:");
		int num = key.nextInt();
		// num이 홀수가 입력되면 예외로 처리 - JVM이 인식하는 예외는 아니지만 예외를 발생시킴
		// throw new Exception클래스()
		if(num % 2 == 1) {
			try {
				throw new MyException("홀수가 입력되었습니다. (error)");					
			}catch (Exception e) {
				System.out.println("예외처리 완료");
				System.out.println("===========");
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("정상동작");
		}
	}
}
