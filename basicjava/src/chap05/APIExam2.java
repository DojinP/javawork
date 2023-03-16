package chap05;

import java.util.Random;

//API 사용법 연습하기2
public class APIExam2 {

	public static void main(String[] args) {
		// java.util 패키지의 Random클래스 이용해서 작업하기
		//  - 변수명 : rand
		// 1. nextInt() 메소드를 호출해서 랜덤수를 다음과 같이 출력하기
		//[출력형태]
		//랜덤수:___
		//메일로 제출
		Random rand = new Random();
		int result = rand.nextInt();
		System.out.println("랜덤수:"+result);
		
		
		// 1부터 100까지 랜덤수도 출력해보기
		// [출력형태]
		// 랜덤수:___
		// nextInt(정수)의 스펙으로 정의된 메소드를 찾아서 api문서를 보고 확인하여 작성
		int result2 = rand.nextInt(100)+1;	// 1 ~ 100
		System.out.println("랜덤수:"+result2);
		
	}

}
