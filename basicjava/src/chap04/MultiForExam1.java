package chap04;

public class MultiForExam1 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++) {
				if(i==2 && j==2) {
					System.out.print("너\t");
				}else {
					System.out.print("2\t");
				}
			}
			System.out.println();
		}
	}
}
