package chap04;

import java.util.Scanner;

public class ForExam_GuGu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("단: ");
		int dan = key.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		key.close();
	}
}
