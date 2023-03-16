package chap05;

import java.util.Scanner;

//Scanner를 이용해서 작업
//1. kor, eng, math 변수를 선언하고 Scanner를 이용하여 값을 할당하기
//2. 이 변수에 저장된 값들을 이용해서 아래와 같은 출력 결과가 나타나도록 프로그램을 작성하세요.
//[출력형태]
//총점:______
//평균:______
public class APIExam3_Scanner {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.print("kor 점수 입력:");
		int kor = key.nextInt();
		System.out.print("eng 점수 입력:");
		int eng = key.nextInt();
		System.out.print("math 점수 입력:");
		int math = key.nextInt();
		
		int tot = kor + eng + math;
		double avg = tot/3.0;
		
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);

	}

}
