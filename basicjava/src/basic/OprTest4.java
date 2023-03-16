package basic;
// 논리연산자 - &&, ||
public class OprTest4{
	public static void main(String[] args){
		int num1 = 200;
		System.out.println("작업시작");

		String str = null;
		//str.length(); - 오류가 발생하는 문장 (NullPoint Error)
		//System.out.println(num1>100 | str.length()>0); // 오류
		// || 연산자의 특징에 맞춰서 첫 번째 항이 true면 나머지 항은 검사하지 않고 넘어간다
		System.out.println(num1>100 || str.length()>0);
		
		// && 연산자의 특징에 맞춰서 첫 번재 항이 false이면 나머지 항은 검사하지 않고 넘어간다
		//System.out.println(num1<100 & str.length()>0); // 오류
		System.out.println(num1<100 && str.length()>0);
		System.out.println("작업종료");

		// 단일 논리연산자는 모든 구문을 검사하지만
		// 이중 논리연산자는 특징에 따라 유연하게 진행된다.
	}
}