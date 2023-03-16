package chap05;
// 2차원 배열의 활용
public class Array2DExam01 {
	public static void main(String[] args) {
		// 1. 2학급의 국어, 수학, 영어 점수를 저장할 배열을 만들고 값을 저장하기
		// A반 - 90, 89, 100
		// B반 - 98, 89, 97
		
		int[][] score = new int[2][3];
		
		// A반 점수입력
		score[0][0] = 90;
		score[0][1] = 89;
		score[0][2] = 100;
		
		// B반 점수입력
		score[1][0] = 98;
		score[1][1] = 89;
		score[1][2] = 97;
		
		// 2. 저장된 배열의 모든 값 출력
		
		for(int i=0; i<2; i++) {
			int avg = 0;
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j] + "\t");
				avg += score[i][j];
			}
			System.out.print(" 합계 : " + avg + "\t");
			System.out.println(" 평균 : " + (avg / score[i].length));
			System.out.println();
		}
	}
}
