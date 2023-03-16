package chap04;

import java.util.Scanner;

public class MultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");

		int score = key.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못입력");
		}else if(score >= 90) {
			System.out.println("점수:"+score+", A학점");
		}else if(score >= 80) {
			System.out.println("점수:"+score+", B학점");
		}else if(score >= 70) {
			System.out.println("점수:"+score+", C학점");
		}else if(score >= 60) {
			System.out.println("점수:"+score+", D학점");
		}else {
			System.out.println("점수:"+score+", F학점");
		}
		
		key.close();
	}
}
