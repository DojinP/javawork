package chap05;
// 배열의 선언, 생성, 초기화 한 번에 작업
public class ArrayTest04 {
	public static void main(String[] args) {
		// 타 언어에서 주로 쓰는 방식
		int[] myarr = {55, 66, 77, 88, 99};
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		
		// 자바답게
		int[] myarr2 = new int[] {10, 20, 30, 40, 50};
		for(int i=0; i<myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}
	}
}
