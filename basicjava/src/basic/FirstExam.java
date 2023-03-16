package basic;

// FirstExam.java를 작성하기
// 1. kor, eng, math 변수를 선언하고 임의의 값을 할당하기
// 2. 이 변수에 저장된 값들을 이용해서 아래와 같은 출력 결과가 나타나도록 프로그램을 작성하세요.
// [출력형태]
// 총점:______
// 평균:______

public class FirstExam
{
	public static void main(String[] args) 
	{
		int kor = 80;
		int eng = 90;
		int math = 70;

		int result1 = kor + eng + math;
		int result2 = result1 / 3;

		System.out.println("총점:"+result1);
		System.out.println("평균:"+result2);
	}
}
