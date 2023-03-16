package chap06;


import java.util.Scanner;

//미니계산기 - if문
public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		MyMethodDemo m = new MyMethodDemo();
		
        System.out.println("*******미니계산기*******");
        System.out.println("1.더하기");
        System.out.println("2.빼기");
        System.out.println("3.곱하기");
        System.out.println("4.나누기");
        System.out.print("연산자를 선택하세요.");
        int opr = key.nextInt();
        System.out.print("숫자를 입력하세요 ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int result = 0;

        result = m.calc(opr, num1, num2);
        
        System.out.println("계산결과=>"+result);
        
        key.close();
	}
}
