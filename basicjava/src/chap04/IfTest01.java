package chap04;

import java.util.Random;

//if문 연습하기
public class IfTest01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		
		System.out.println(num);
		
		if(num>90) {
			System.out.println("테스트작업완료");
			System.out.println("처리진행");
		}
		System.out.println("종료");
	}
}
