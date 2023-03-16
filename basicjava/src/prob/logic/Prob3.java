package prob.logic;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		
		int inputInt = 1;
		try {
			inputInt = keyboard.nextInt();
		} catch (Exception e) {
			System.err.print("�Է��Ͻ� ���� Integer Type�� �ƴմϴ�.");
			return;
		}
		
		//���α׷��� �����ϼ���.
		
	}
}
