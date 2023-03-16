package chap04;

import java.util.Scanner;

//if문 중첩하기
public class IfTest03 {
	public static void main(String[] args) {
		//IfTest02와 동일한 작업을 처리
		//단, jumsu는 0보다 작거나 100보다 큰 값을 입력 받으면 "잘못입력"
		//   jumsu가 0보다 크거나 같고 100보다 작거나 같은 경우 평가하고
		//   조건을 만족하지 않으면 "잘못입력"
		Scanner key = new Scanner(System.in);
		System.out.print("점수입력:");
		int jumsu = key.nextInt();
		String result = "";
		if(jumsu < 0 | jumsu > 100)
			System.out.println("잘못입력");
		else {
			//평가 - if문을 이용해서 평가하기(if문안에 if문을 사용 - if문의 중첩사용)
			if(jumsu >= 90) {
				result = "pass";
			}else {
				result = "fail";
			}
			System.out.println("점수는 "+jumsu+"이고, "+result);
		}
		
		// jumsu가 0보다 크거나 같고 100보다 작거나 같은 경우 평가하고 조건을 만족하지 않으면 "잘못입력"
		if(jumsu >= 0 | jumsu <= 100) {
			// 평가
			if(jumsu >= 90) {
				result = "pass";
			}else {
				result = "fail";
			}
			System.out.println("점수는 "+jumsu+"이고, "+result);
		}else {
			System.out.println("점수가 잘못 입력됐습니다.");
		}
	}
}
