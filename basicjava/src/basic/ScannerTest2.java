package basic;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int data = key.nextInt();	// nextXXX메소드는 spacebar나 enter 전의 입력 값만 읽는다.
		System.out.println("입력한 숫자" + data);
		
//		System.out.println("숫자입력2:");
//		int data2 = key.nextInt();
//		System.out.println("입력한 숫자" + data2);
		
		System.out.println("문장입력:");
		// nextline은 한 문장을 모두 읽기
		key.nextLine();
		String line = key.nextLine();
		System.out.println(line);
		
	}

}
