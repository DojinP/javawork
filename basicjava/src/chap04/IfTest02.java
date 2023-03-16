package chap04;

import java.util.Scanner;

// if ~ else
public class IfTest02 {
	public static void main(String[] args) {
		// 점수 입력받고 90점 이상은 pass, 나머지는 fail
		// Scanner 이용해서 작업
		// [출력형식]
		// 점수는 ___점이고, ___
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("점수입력: ");
		int score = key.nextInt();
		
		System.out.print("점수는 "+score+"점이고, ");
		
		if(score >= 90)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		key.close();
	}
}
