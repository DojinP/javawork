package chap04;

public class Chap04_Q3 {

	public static void main(String[] args) {
		int result = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				result += i;
			}
		}
		System.out.println("3의 배수의 총합은 " + result + "입니다.");
	}

}
