package algorithm.basic;

import java.util.Scanner;

public class Problem_10951_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
}
