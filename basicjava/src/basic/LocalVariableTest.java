package basic;
// 자바에서의 로컬변수의 특징
// 로컬변수는 클래스블럭을 제외하고 모든 블럭 안에서 선언된 변수를 일컫는다.
public class LocalVariableTest {
	public static void main(String[] args) {
		int j = 10; //로컬변수(지역변수)
		int num;
		//1. 로컬변수는 사용하기전에 초기화(=연산자로 값을 할당) 해야 한다.
		//System.out.println("num=>"+num);
		if(j>=10) {
			int val = 1000;
			System.out.println("j는 10과 같다. ===> " + val);
		}
		//2. 로컬변수는 선언된 블럭 내부에서만 사용할 수 있다
		//	블럭이 끝나면 메모리에서 해제
		//System.out.println(val);
		for(int i=1; i<10; i++) {
			System.out.println("지역변수테스트...");
		}
		//3. for문에서 선언되는 초기화 변수도 for 블럭 안에 선언된 지역변수로 취급된다.
		//System.out.println("for문 사용 i변수 => " + i);
		//4. for문에서 사용하는 초기화 변수 값을 for 블럭 밖에서 사용해야한다면 for문 밖에서 선언한 후 사용하다.
		int i=0;
		for(i=1; i<10;i++) {
			System.out.println("지역변수테스트...for");
		}
		System.out.println("for문 사용 i변수 => " + i);
	}
}
