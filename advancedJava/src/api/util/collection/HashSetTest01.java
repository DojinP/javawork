package api.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Set
// = 집합 (순서가 없고, 중복이 허용되지 않는다.)
public class HashSetTest01 {
	public static void main(String[] args) {
		// List의 중복 허용
		ArrayList<String> list = new ArrayList<>(); // 똑같으면 뒤에는 자료형 생략 가능
		list.add("자바");
		list.add("서블릿");
		list.add("JSP");
		list.add("스프링");
		list.add("스프링");
		
		int size = list.size();
		
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("================================================================");
		
		// 1. HashSet 생성
		HashSet<String> set = new HashSet<>();
		
		// 2. HashSet에 데이터 추가
		set.add("자바");
		set.add("서블릿");
		set.add("JSP");
		set.add("스프링");
		set.add("스프링");
		
		// 3. HashSet에 저장된 요소의 개수
		size = set.size();
		System.out.println(size);
		System.out.println(set.contains("스프링"));
		System.out.println("=================================================================");

		// 4. Set에 저장된 요소를 출력
		// 4-1. 향상된 for문 이용 (version 5 이후만 가능)
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println("=================================================================");
		
		// 전체 데이터를 액세스 하는 경우 표준 포맷인 Iterator로 변환한 후에 읽는다.
		// 4-2. HashSet을 Iterator로 변환하기
		Iterator<String> it = set.iterator();
		
		// Iterator에 담긴 데이터를 꺼내기
		while(it.hasNext()) {
			String str = it.next();	// Iterator에 저장된 값 꺼냄
			System.out.println(str);
		}
		
		System.out.println("=================================================================");

		set.remove("스프링");
		System.out.println(set.size());
		
		//HashMapTest
		if(list instanceof Iterable) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
	}
}
