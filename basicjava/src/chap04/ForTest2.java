package chap04;

public class ForTest2 {
	public static void main(String[] args) {
		// 다음과 같은 조건을 만족할 수 있도록 작업
		// for문을 10번 실행
		// 홀수번째는 **********
		// 짝수번째는 ==========
		// 초기화 변수를 여러 개 정의할 수 있다.
		// -> 초기화 변수를 여러 개 정의하면 조건과 증감식에도 추가해야 한다.
		
		for(int i=1, j=10; i<=10 && j<=15; i++, j++) {
			if(i%2 != 0) {
				System.out.println("**********");
			}else {
				System.out.println("==========");
			}
		}
	}
}
