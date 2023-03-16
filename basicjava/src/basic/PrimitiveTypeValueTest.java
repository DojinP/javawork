package basic;
// 기본형 데이터 표현하기
public class PrimitiveTypeValueTest {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int num = 100; // 변수
		num = 200;
		
		// final 키워드가 붙은 변수는 상수가 된다.
		// 상수는 정해진 값이 저장된 변수로 값을 다시 변경할 수 없다
		// 상수는 대문자로 정의하는 것이 관례적이다
		final int NUM2 = 200;
		// NUM2 = 300;
		
		System.out.println(num);
		
		// 논리형 - boolean
		boolean boolVal = true;
		System.out.println("boolVal => " + boolVal);
		
		// 정수형
		// byte b = 127
		//     ---  ---
		//     변수  리터럴
		//     byte  int
		byte b = 127;
		short s = 10000;
		int i = 2147483647;
		long l = 2147483648L; // int형 리터럴로 long 타입의 리터럴을 표현할 수 없으므로 접미사 추가
		
		// 실수형
		// float f = 10.5
		//      --  ------
		//      변수  리터럴
		//    float  double
		float f = 10.5f;
		double d = 10.5;
		
		// 문자형
		// char
		char a = 'A';
		a = '한';
		
		
		// String
		// String은 기본형이 아니라 참조형 타입이지만 많이 사용되므로 리터럴로 표현이 가능하다
		// String 타입의 리터럴은 " "
		String str = "참조형인 String을 기본형으로 표현하는 경우 리터럴은 큰따옴표를 추가해서 구분";
		System.out.println("String => " + str);
		System.out.println("char => " + a);
		
//		System.out.println(10/3.0);
		
//		double val1 = 10;
//		double val2 = 3;
//		double result = val1 + val2;
//		System.out.println(result);
//		
//		System.out.println(3/10.0);
		
		
	}

}
