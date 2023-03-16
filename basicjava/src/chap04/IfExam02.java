package chap04;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = key.nextInt();
		
		if(num == 0) {
			System.out.println("0");
		}else if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("양수이면서 짝수");
			}else {
				System.out.println("양수이면서 홀수");
			}
		}else {
			System.out.println("음수");
		}
		
		key.close();
	}

}
