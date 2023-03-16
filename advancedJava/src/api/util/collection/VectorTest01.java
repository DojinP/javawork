package api.util.collection;

import java.util.Random;
import java.util.Vector;

import api.lang.Person;

public class VectorTest01 {

	public static void main(String[] args) {
		// 1. Vector의 생성
		// => Generic <> 을 적용하여 Vector에 저장도니 요소의 타입을 명시해야 한다.
		// => Vector 안에 저장될 데이터 타입을 제한 (기본형인 경우에는 Wrapper클래스 타입으로 명시)
//		Vector<String> v1 = new Vector<String>();
		Vector<Integer> v1 = new Vector<Integer>();				// int[] arr = new int[10]
		
		// 2. Vector에 데이터 추가
//		v1.add("java");
		v1.add(10);							// arr[0] = 10
//		v1.add(new Random());
//		v1.add(new Person());
		System.out.println("현재 벡터에 저장된 요소의 개수 => " + v1.size());
		System.out.println("현재 벡터의 용량 => " + v1.capacity());
		
		for (int i=1; i<=10; i++) {
			v1.add(i);
		}
		
		// Vector는 용량이 자동으로 증가한다.
		// 3. Vector에 저장된 요소의 개수
		System.out.println("현재 벡터에 저장된 요소의 개수 => " + v1.size());	// arr.length
		System.out.println("현재 벡터의 용량 => " + v1.capacity());
		
//		for (int i=1; i<=30; i++) {
//			v1.add(i);
//		}
//		
//		System.out.println("현재 벡터에 저장된 요소의 개수 => " + v1.size());
//		System.out.println("현재 벡터의 용량 => " + v1.capacity());
		
		// 4. Vector에 저장된 요소를 꺼내기
		// index
		
		System.out.println("1번 요소에 저장된 값 => " + v1.get(1));		// sysout(arr[1])
		
		// 5. Vector에 저장된 모든 요소를 꺼내기
		for (int i=0; i<v1.size(); i++) {
			int data = v1.get(i);
			System.out.println(i+"번째 요소 => " + data);
		}
		
		v1.set(10, 100);
		// foreach 방식
		for (int data2 : v1) {
			System.out.println("벡터에 저장된 데이터 => " + data2);
		}
	}

}
