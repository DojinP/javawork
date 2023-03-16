package prob.logic;
import java.util.Scanner;
public class Pyramid { 
	public static void main(String[] args) { 
		
		int size = 40; 
		Scanner keyboard = new Scanner(System.in);  
		System.out.print("1 ~ 40������ ������ �Է��ϼ���. : ");
		size = keyboard.nextInt();
		
		Pyramid myTriangle = new Pyramid();
		myTriangle.printPyramid(size);
		
	}
	
	public void printPyramid(int size) {

		/*  �̰��� ���α׷��� �ϼ��Ͻʽÿ�. */ 
		
	} 
}

