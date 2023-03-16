package chap06.oop.basic;


import java.util.Scanner;

//Scanner로 단을 입력 받아 출력
public class ForExam_GuGu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int dan = key.nextInt();


		MyMethodDemo m = new MyMethodDemo();
		
		m.printGuGu(dan);
		
		key.close();
	}
}
