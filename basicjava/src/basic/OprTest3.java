package basic;
// 논리연산자 - &(and), |(or)
public class OprTest3{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 200;

		// & 연산자
		// true & true
		System.out.println("num1<num2 & num1>=100 => " + ((num1<num2) & (num1>=100)));
		// true & false
		System.out.println("num1<num2 & num1>100 => " + ((num1<num2) & (num1>100)));
		// false & true
		System.out.println("num1>num2 & num1>=100 => " + ((num1>num2) & (num1>=100)));
		// false & false
		System.out.println("num1>num2 & num1>100 => " + ((num1>num2) & (num1>100)));

		System.out.println();

		// | 연산자
		// true | true
		System.out.println("num1<num2 | num1>=100 => " + ((num1<num2) | (num1>=100)));
		// true | false
		System.out.println("num1<num2 | num1>100 => " + ((num1<num2) | (num1>100)));
		// false | true
		System.out.println("num1>num2 | num1>=100 => " + ((num1>num2) | (num1>=100)));
		// false | false
		System.out.println("num1>num2 | num1>100 => " + ((num1>num2) | (num1>100)));

		System.out.println();

		// !(not)
		System.out.println(!true);
		System.out.println(!false);
	}
}