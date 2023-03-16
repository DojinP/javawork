package basic;

import java.util.Scanner;

// API 활용 - Scanner 테스트
// 키보드로 입력받은 값을 프로그램 안에서 사용할 수 있도록 기능을 제공
// 모니터로 출력 = 표준출력 : System.out
// 키보드로 입력 = 표준입력 : System.in
// ctrl+shift+o = 자동 import
public class ScannerTest {

	public static void main(String[] args) {
		// key
		// 키보드로 입력되는 값을 Scanner 클래스에서 사용하도록 정의
		Scanner key = new Scanner(System.in);
		// 스페이스바나 엔터키가 눌려지기 전에 입력한 단어 한 개만 읽어서 리턴
		System.out.println("단어입력:");
		String data = key.next();
		System.out.println("사용자가 입력한 값은 => "+data);
		System.out.println("실수입력:");
		double doubledata = key.nextDouble();
		System.out.println("사용자가 입력한 실수 => "+doubledata);
		
		System.out.println("정수입력:");
		int intdata = key.nextInt();
		System.out.println("사용자가 입력한 정수 => "+intdata);
		
		// 표준입력을 입력 대기하는 작업을 close에서 반납
		key.close();
	}

}
