package chap11.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch 사용하기
// 예외처리 : try ~ catch ~ catch ....
// 각각의 예외에 대해 다르게 처리하고 싶은 경우 catch 구문을 중복 사용하여 사용할 수 있다.
// 단 상위 Exception은 하단에 정의해야한다.
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = null;
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("시작");
			System.out.print("숫자입력:");
			int num1 = key.nextInt();
			System.out.print("나눌 숫자 입력:");
			int num2 = key.nextInt();
			System.out.println("결과=>"+num1/num2);
			System.out.println("종료");
			System.out.println(str.length());
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}catch(InputMismatchException e) {
			System.out.println("문자를 입력할 수 없음");
		}catch(Exception e) {	// 다형성
								// 하위 Exception들을 포함하는 부모클래스이므로 상기 두 클래스보다 먼저 catch 구문에 사용하면 안된다.
			System.out.println("그 외 예외");
		}
	}
}
