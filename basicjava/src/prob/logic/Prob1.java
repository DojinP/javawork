package prob.logic;
import java.util.Scanner;
public class Prob1 {

	public static void main(String args[]) {

		int inputInt = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");

		try {
			inputInt = keyboard.nextInt();
		} catch (Exception e) {
			System.err.print("입력하신 값은 Integer Type이 아닙니다.");
			return;
		}

		// 프로그램을 구현하세요.
	}
}
