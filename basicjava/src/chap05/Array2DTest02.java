package chap05;
// 2차원 배열의 활용예제 - 다차원배열 선언하기
public class Array2DTest02 {
	public static void main(String[] args) {
		// 1. 2학급의 국어, 수학, 영어 점수를 저장할 배열을 만들고 값을 저장하기
		// A반 - 90, 89, 100
		// B반 - 98, 89, 97
		
		int[][] score = {{90, 89, 100}, {98, 89, 97}};

		// 2. 저장된 배열의 모든 값 출력
		
		for(int i=0; i<2; i++) {
			int sum = 0;
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.print(" 합계 : " + sum + "\t");
			System.out.println(" 평균 : " + (sum / score[i].length));
			System.out.println();
		}
	}
}
