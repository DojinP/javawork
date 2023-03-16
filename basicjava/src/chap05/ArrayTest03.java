package chap05;
// 배열을 액세스하기
public class ArrayTest03 {
	public static void main(String[] args) {
		// 배열의 선언과 생성
		int[] myarr = new int[5];
		// 배열의 초기화
		myarr[0] = 20;
		myarr[4] = 100;
		
		// 배열의 요소의 개수
		System.out.println("배열 요소의 개수 : " + myarr.length);
		
		// 배열 액세스 -> for 이용해 배열에 접근가능하다
		for(int i=0; i<=4; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("-----------------------");
		for(int i=0; i<5; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("-----------------------");
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("-----------------------");
		// for 문 이용하여 배열요소에 100을 할당
		for(int i=0; i<myarr.length; i++) {
			myarr[i] = 100;
		}
		
		// 배열에 새롭게 할당된 값을 출력하기
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
	}
}
