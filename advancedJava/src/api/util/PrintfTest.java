package api.util;
// System.out.printf 메소드 확인
public class PrintfTest {
	public static void main(String[] args) {
		String str = "java programming";
		String str2 = "재밌다.";
		/*
		 * 출력형식을 기호를 이용해서 설정
		 * %d -> 정수출력
		 * %s -> 문자열
		 * %f -> 실수
		 * %n -> 줄바꿈
		 * 
		 * System.out.println("%s , %s %n", 매개변수1, 매개변수2, ...);
		 * 					  ------------  -----------------
		 * 						출력형식		 출력형식에 연결할 값
		 *  
		 */
		
		System.out.printf("%s , %s %n", str, str2);
		System.out.printf("[%20s ]%n", str);
		System.out.printf("[%-20s ]%n", str);
		
		System.out.printf("%d %n", 100);
		System.out.printf("값 => (%d, %d) %n", 1000, 2000);
		System.out.printf("%f %n", 1000.123);
		System.out.printf("%5.2f %n", 1000.123);
		System.out.printf("%10.2f %n", 1000.123);
		System.out.printf("%10.2f %n", 1234567899.123);
		
	}
}
