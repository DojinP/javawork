package chap05;
public class Array2DExam02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		// 초기화
		int cnt = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		
		// 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
