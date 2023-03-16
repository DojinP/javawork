package chap05;

import java.util.Random;
// 배열연습
public class ArrayExam02 {
	public static void main(String[] args) {
		// 1~100 까지 랜덤수가 배열에 저장될 수 있도록 작성
		// int형 배열 (요소 5개)
		// 배열에 저장된 데이터를 액세스해서 다음과 같이 작업
		// [출력형식]
		// 0번요소 -> ______ (짝수 | 홀수)
		// ...
		// 4번요소 ...
		
		int[] randarr = new int[5];
		Random rand = new Random();
		
		for(int i=0; i<randarr.length; i++) {
			randarr[i] = rand.nextInt(100)+1;
		}
		
		for(int i=0; i<randarr.length; i++) {
			if(randarr[i] % 2 == 1) {
				System.out.println(i + "번요소 -> " + randarr[i] + " (홀수)");
			}else {
				System.out.println(i + "번요소 -> " + randarr[i] + " (짝수)");
			}
		}
	}
}
