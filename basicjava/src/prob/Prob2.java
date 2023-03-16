package prob;
import java.util.Scanner;
public class Prob2 {
	public static void main(String args[]) {
		int start = 0 ;
		int end = 0;
		int step = 0 ;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("초기 값을 정수로 입력하세요. : ");
		start = keyboard.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요. : ");
		end = keyboard.nextInt();
		System.out.print("증가분을 정수로 입력하세요. : ");
		step =  keyboard.nextInt();
		
		
		/*  이곳에 프로그램을 완성하십시오. */	
		for(int i=start; i<=end; i+=step) {
			sum += i;
		}
		
		if(sum > 1000) {
			sum += 2000;
		}
		
		System.out.println("총합은 " + sum +" 입니다. "); 
		
	} 
	
}
