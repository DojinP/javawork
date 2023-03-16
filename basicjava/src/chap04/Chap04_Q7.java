package chap04;

import java.util.Scanner;

public class Chap04_Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean cycle = true;

		while (cycle) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int select = sc.nextInt();
			int input = 0;
			
			switch(select) {
			case 1:
				System.out.print("예금액>");
				input = sc.nextInt();
				balance += input;
				break;
			case 2:
				System.out.print("출금액>");
				input = sc.nextInt();
				if(balance < input) {
					System.out.println("잔액이 부족합니다.");
				}else {
					balance -= input;
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				cycle = false;
				break;
			default:
				System.out.println("잘못된 입력");
			}
		}

		sc.close();
	}

}
