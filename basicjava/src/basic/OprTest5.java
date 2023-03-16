package basic;
// 삼항연산자, 대입연산자
public class OprTest5{
	public static void main(String[] args){
		int num1 = 99;
		String str = "문자열";
		// 조건? 조건이 만족하는 경우 리턴될 값(결과) : 조건이 만족하지 않을 경우 리턴될 값
		String result = num1 > 90 ? "합격" : "불합격";
		System.out.println(result); 

		int intValResult = num1 > 90 ? 10000 : 0;
		System.out.println(intValResult);

		// 대입연산자
		int i = 100;
		i = i + 10;
		System.out.println("i="+i);

		i+=30; //i = i + 30
		System.out.println("i="+i);

		i-=30; //i = i - 30
		System.out.println("i="+i);

		i*=30; //i = i * 30
		System.out.println("i="+i);

		i/=30; //i = i / 30
		System.out.println("i="+i);
	}
}
