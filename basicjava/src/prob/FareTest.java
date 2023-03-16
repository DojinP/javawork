package prob;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("---------menu---------");
		System.out.println("1. 가정용 (liter 당 50원)");
		System.out.println("2. 상업용 (liter 당 45원)");
		System.out.println("3. 공업용 (liter 당 30원)");
		System.out.println("----------------------");
		System.out.print("메뉴를 선택하세요 => ");
		int menu = key.nextInt();
		System.out.println("----------------------");

		System.out.print("사용량을 입력하세요 => ");
		int use = key.nextInt();

		System.out.println("======================");

		int tot_use = 0;
		
		switch (menu) {
		case 1:
			tot_use = use * 50;
			break;
		case 2:
			tot_use = use * 45;
			break;
		case 3:
			tot_use = use * 30;
			break;
		default:
			System.out.println("잘못된 입력");
			return;
		}
		
		double tot_tax = tot_use * 1.05;
		
		System.out.println("사용자 코드 : " + menu);
		System.out.println("사용 요금 : " + tot_use);
		System.out.println("총 수도 요금 : " + tot_tax);

		System.out.println("======================");
	}

}
