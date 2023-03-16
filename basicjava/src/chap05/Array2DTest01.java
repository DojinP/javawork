package chap05;
// 2차원 배열을 정의하고 액세스 - 배열의 배열(배열을 참조하는 배열)
public class Array2DTest01 {
	public static void main(String[] args) {
		int[][] myarr = new int[3][2];
		// myarr 가 참조하는 배열의 0번 요소가 참조하는 배열의 0번째 요소에 100을 할당
		myarr[0][0] = 100;
		myarr[1][0] = 100;
		myarr[2][0] = 100;
		// myarr 길이
		System.out.println("배열의 길이 => " + myarr.length);
		// myarr 의 0번 요소가 참조하는 배열의 길이
		System.out.println("0번요소가 참조하는 배열의 길이 => " + myarr[0].length);
		System.out.println("1번요소가 참조하는 배열의 길이 => " + myarr[1].length);
		System.out.println("2번요소가 참조하는 배열의 길이 => " + myarr[2].length);
		
		for(int k=0; k<3; k++) {
			for(int i=0; i<2; i++) {
				System.out.print(myarr[k][i] + "\t");
			}
			System.out.println();
		}
		
//		그냥 내가 해보는 테스트
//		for(int[] data : myarr) {
//			for(int val : data) {
//				System.out.print(val + " ");
//			}
//		}
	}
}
