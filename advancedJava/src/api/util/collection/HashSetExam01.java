package api.util.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam01 {

	public static void main(String[] args) {
		// 1. 100, 90, 88, 77, 100을 HashSet에 저장하기
		HashSet<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(90);
		set.add(88);
		set.add(77);
		set.add(100);
		
		// 4. 2번에서 정의한 메소드 호출해서 리턴받은 배열 출력하기
		/*
		 * 5.0 에 추가된 for문은 컬렉션을 탐색하기 위한 for
		 * for(타입 변수명 : 컬렉션){
		 * 			|	  ------
		 * 			|		ㄴ배열, List, Set
		 * 			ㄴ 컬렉션(자료구조)에서 꺼낸 데이터의 타입
		 * }
		 */
		int[] result = changeArr(set);
		for(int data : result) {
			System.out.print(data + " ");
		}
		System.out.println();
		// 5. 3번에 정의한 메소드 호출해서 HashSet에 저장된 요소 출력하기
		print(set);
	}

	// 2. HashSet을 배열로 변환하는 메소드를 작성
	// 메소드명 : changeArr
	// 매개변수 : HashSet(타입은 임의로 정의)
	// 리턴타입 : 배열
	public static int[] changeArr(HashSet<Integer> set) {
		int[] ret = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		for(int i=0; i<set.size(); i++) {
			ret[i] = it.next();
		}
		return ret;
	}
	// 3. HashSet에 저장된 요소를 출력하는 메소드
	//  => Iterator 사용하여 출력
	//  => 메소드 스펙은 임의로 정의
	public static void print(HashSet<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int data = it.next();
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
