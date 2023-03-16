package basic;
// 비교연산자 - 결과가 참/거짓
public class OprTest2{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;

		// +연산자는 더하기의 역할과 연결 연산자의 역할을 동시에 수행
		// +앞의 값이 문자열(String)이면 뒤의 값도 String으로 인식하므로 +연산을 수행할 수 없음
		//System.out.println("더하기=>"+100+200);
		//System.out.println("num1>num2 => " + num1>num2);

		//System.out.println("더하기=>" + (100+200));
		System.out.println("num1>num2 => " + (num1>num2));
		System.out.println("num1>=num2 => " + (num1>=num2));
		System.out.println("num1<num2 => " + (num1<num2));
		System.out.println("num1<=num2 => " + (num1<=num2));
		System.out.println("num1==num3 => " + (num1==num3));
		System.out.println("num1!=num3 => " + (num1!=num3));


	}
}