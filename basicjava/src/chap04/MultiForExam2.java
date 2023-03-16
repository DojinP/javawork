package chap04;

public class MultiForExam2 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				cnt++;
				System.out.print(cnt+"\t");
			}
			System.out.println();
		}
	}
}
