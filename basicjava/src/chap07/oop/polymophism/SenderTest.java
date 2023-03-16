package chap07.oop.polymophism;

import java.util.Scanner;
public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender시스템********");
		System.out.println("1. Email로 전송");
		System.out.println("2. SMS로 전송");
		System.out.println("3. SNS로 전송");
		System.out.print("원하는 작업을 선택하세요:");
		int work = key.nextInt();
		Sender sender = null;
		SenderLogic logic = new SenderLogic();
		switch(work){
			case 1:
				sender = new EmailSender("메일로전송",100);
				break;
			case 2:
				sender = new SMSSender("단문자",80);
				break;
			case 3:
				sender = new SNSSender("소셜네트워크로 전송", 80);
		}
		logic.run(sender);
		System.out.println("*******************");
		logic.exe(sender);
	}
}
