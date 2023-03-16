package basic;
// 산술연산자 확인하기
public class OprTest1{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 30;
		
		// + 연산자
		int result = num1 + num2;
		System.out.println("더한결과 -> " + result);

		// - 연산자
		result = num1 - num2;
		System.out.println("뺀결과 -> " + result);

		// * 연산자
		result = num1 * num2;
		System.out.println("곱하기결과 -> " + result);

		// / 연산자
		result = num1 / num2;
		System.out.println("나누기(몫)결과 -> " + result);

		// % 연산자
		result = num1 % num2;
		System.out.println("나누기(나머지)결과 -> " + result);

		// 단항연산자(증감연산자)
		int x = 5;
		int y = x++;
		System.out.println("x:"+x+" y:"+y);

		x = 5;
		y = ++x;
		System.out.println("x:"+x+" y:"+y);

		x = 5;
		y = x--;
		System.out.println("x:"+x+" y:"+y);

		x = 5;
		y = --x;
		System.out.println("x:"+x+" y:"+y);
	}

}