package chap04;
// *보충필요
import java.util.Scanner;

public class MiniCalc_While {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("*******미니계산기*******");
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("3. 빼기");
			System.out.println("4. 나누기");
			System.out.println("이외의 입력을 입력하면 계산기 종료");
			System.out.println("**********************");
			System.out.print("연산자를 선택하세요.");

			int choice = key.nextInt();

			System.out.print("숫자를 입력하세요 ");

			int num1 = key.nextInt();
			int num2 = key.nextInt();

			switch (choice) {
			case 1: // 더하기
				System.out.println("계산결과=>" + (num1 + num2));
				break;
			case 2: // 곱하기
				System.out.println("계산결과=>" + (num1 * num2));
				break;
			case 3: // 빼기
				System.out.println("계산결과=>" + (num1 - num2));
				break;
			case 4: // 나누기
				System.out.println("계산결과=>" + (num1 / num2));
				break;
			default:
				run = false;
//				System.out.println("잘못된 연산자 선택");
			}
		}
		key.close();
	}

}
