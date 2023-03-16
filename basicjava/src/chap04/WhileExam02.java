package chap04;

import java.util.Scanner;

// ForExam_GuGu while문으로 변경
public class WhileExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("단: ");
		int dan = key.nextInt();
		
		int i = 1;
		while(i<=9) {
			System.out.println(dan + "*" + i + " = " + dan*i);
			i++;
		}
		
		key.close();
	}
}
