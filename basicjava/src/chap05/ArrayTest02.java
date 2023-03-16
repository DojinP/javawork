package chap05;

import java.util.Random;

//배열의 사용 - 배열의 선언, 생성, 초기화
public class ArrayTest02 {
	public static void main(String[] args) {
		// 1. 배열의 선언과 생성을 한번에 진행
		int[] myarr = new int[3];
		double[] myarr2 = new double[5];
		boolean[] myarr3 = new boolean[2];
		char[] myarr4 = new char[5];
		String[] myarr5 = new String[10];
		Random[] myarr6 = new Random[100];
		// 배열변수는 초기값이 자동으로 할당된다.
		// 정수형의 경우 0
		// 실수형의 경우 0.0
		// 논리형의 경우 false
		// 참조형의 경우 null
		System.out.println(myarr[0]);	//int
		System.out.println(myarr2[0]);	//double
		System.out.println(myarr3[0]);	//boolean
		System.out.println(myarr4[0]);
		System.out.println(myarr5[0]);
		System.out.println(myarr6[0]);
		
		// 3. 배열의 초기화
		//    => 배열의 각 요소에 값을 할당한다
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		// 접근할 수 있는 배열의 요소를 벗어나면 ArrayIndexOutOfBoundsException 발생
//		System.out.println(myarr[3]);
	}
}
