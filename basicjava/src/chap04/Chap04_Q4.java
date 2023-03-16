package chap04;

import java.util.Random;

public class Chap04_Q4 {

	public static void main(String[] args) {
		Random rand = new Random();
		boolean run = true;
		
		int dice1 = 0;
		int dice2 = 0;
		
		while (run) {
			dice1 = rand.nextInt(6) + 1;
			dice2 = rand.nextInt(6) + 1;
			
			int sum = dice1 + dice2;
			
			if(sum == 5) {
				run = false;
				break;
			}
			
			System.out.println("(" + dice1 + ", " + dice2 + ") - 재시행");
		}

		System.out.println("(" + dice1 + ", " + dice2 + ") - 종료");
	}

}
