package chap11.exception;

import java.util.Scanner;

public class ExceptionExam02 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;

		//여기를 작성하십시오.
		
		try {
			result = convert(str);			// convert가 예외발생 가능성이 있는 코드
			System.out.println("변환된 숫자는 " + result + " 입니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		} catch (IllegalArgumentException e) {
//			System.out.println("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
			System.out.println(e.getMessage());
		}
	}
	
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) throws IllegalArgumentException {								// throws 는 메소드를 호출한 쪽으로 예외를 던지는 것 (예외 떠넘기기)
		//여기를 작성하십시오.
		int result = 0;
		if(str == null || str.length() == 0) {
			
			throw new IllegalArgumentException("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다."); 	// throw는 예외를 발생시키는 것
																											// 특정 원하는 조건에서 예외를 발생시키기 위해 선언하는 구문
		}else {
			result = Integer.parseInt(str);
		}
		return result;
	}
}