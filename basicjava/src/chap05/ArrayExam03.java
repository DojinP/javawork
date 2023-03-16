package chap05;

import java.util.Scanner;

// 참조형 배열 만들기
public class ArrayExam03 {

	public static void main(String[] args) {
		// 1. String 객체를 참조하는 변수가 저장될 배열을 만들기
		//  => 5개의 요소를 만들기
		//  => 각 요소가 참조할 String 객체를 만들어서 할당하기
		//  => String 객체를 만들 때 사용할 문자열 (html, css, javascript, jquery, servlet)
		//  => 모든 배열요소가 참조하는 String 객체의 문자열을 출력하기 (향상된 for문)
		
		String[] arr1 = new String[5];
		
		arr1[0] = new String("html");
		arr1[1] = new String("css");
		arr1[2] = new String("javascript");
		arr1[3] = new String("jquery");
		arr1[4] = new String("servlet");

		for(String data : arr1) {
			System.out.println(data);
		}
		
		// 2. Scanner 객체를 참조하는 변수가 저장될 배열을 만들기
		//  => 3개의 요소
		//  => Scanner 객체를 만든 후에 배열의 요소에 할당
		//  => 각 배열이 참조하는 값을 출력하기 (향상된 for 문)
		
		Scanner[] arr2 = new Scanner[3];
		
		arr2[0] = new Scanner(System.in);
		arr2[1] = new Scanner(System.in);
		arr2[2] = new Scanner(System.in);
		
		for(Scanner data : arr2) {
			System.out.println(data);
		}
	}
}
