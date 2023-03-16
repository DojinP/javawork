package basic;
// TimeTest.java 작성
// int형 변수 선언 8800 할당
// 8800이 초 데이터라 가정하고 시분초로 표현
// 코드로 표현하면서 변수가 필요하면 선언하고 사용해도 가능
// [출력형태]
// ___시간___분___초

public class TimeTest {
	public static void main(String[] args){
		int time = 8800;
		int hour = time / (60 * 60);
		time = time - (hour * (60 * 60));
		int min = time / 60;
		time = time - (min * (60));
		int sec = time;

		System.out.println(hour+"시간 "+min+"분 "+sec+"초");
	}
}