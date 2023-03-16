package chap05;
// 배열만들기 실습
public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. int형 데이터가 저장될 배열을 생성
		//  -> 5개의 요소를 갖도록
		// 100, 200, 300, 400, 500의 값을 할당
		// 2. 저장된 배열 출력
		int[] myarr = new int[5];
		
		for(int i=0; i<myarr.length; i++) {
			myarr[i] = (i+1) * 100;
		}
		
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
	}

}
