package chap04;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");

		int score = key.nextInt();
		
		switch(score/10) {
		// 90 ~ 100
		case 10:
		case 9:
			// 101~109를 못거르기 때문에 추가
			if(score > 100) {
				System.out.println("잘못입력");
				break;
			}
			System.out.println("점수:"+score+", A학점");
			break;
		// 80 ~ 89
		case 8:
			System.out.println("점수:"+score+", B학점");
			break;
		// 70 ~ 79
		case 7:
			System.out.println("점수:"+score+", C학점");
			break;
		// 60 ~ 69			
		case 6:
			System.out.println("점수:"+score+", D학점");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			// -9 ~ -1값 제외
			if(score < 0) {
				System.out.println("잘못입력");
				break;
			}
			System.out.println("점수:"+score+", F학점");
			break;
		default:
			System.out.println("잘못입력");
		}
		
		key.close();

	}

}
