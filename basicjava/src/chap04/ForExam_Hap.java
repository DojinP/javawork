package chap04;

public class ForExam_Hap {
	public static void main(String[] args) {
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%2 == 1) {
				oddsum += i;
			}else {
				evensum += i;
			}
		}
		
		System.out.println("총합:" + sum);
		System.out.println("홀수합:" + oddsum);
		System.out.println("짝수합:" + evensum);
	}
}
