package chap06;
// 문자열을 숫자로 변경하는 방법
// Integer 클래스의 parstInt 메소드를 이용하면 String 데이터를 int 데이터로 변경할 수 있다.
public class IntegerTest {
	public static void main(String[] args) {
		// int = String
		// 숫자모양을 하고 있는 문자열은 변환이 가능
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(args[0] + args[1]);
		System.out.println(num1+num2);
	}
}
