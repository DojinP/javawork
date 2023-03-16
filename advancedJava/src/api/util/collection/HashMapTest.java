package api.util.collection;

import java.util.HashMap;
import java.util.Set;

// Map
// => key와 value 저장하기 위해 사용
// => key와 value에 대한 모든 타입을 정의하고 작업
// => servlet과 jsp 내부에서 사용하는 데이터 저장 구조는 모두 Map
public class HashMapTest {
	public static void main(String[] args) {
		// 1. HashMap 생성
		HashMap<String, Integer> map = new HashMap<>();
		
		// 2. Map에 데이터 저장하기
		// => Map도 순서가 없는 자료구조, key의 값으로 저장될 위치를 계산해서 저장되기 때문에 추출했을때 순서대로 나오지 않는다.
		map.put("a01",  100);
		map.put("a02",  200);
		map.put("a03",  300);
		map.put("a04",  400);
		map.put("a05",  500);
		map.put("a06",  600);
		
		// 3. Map에 저장된 요소의 개수
		System.out.println(map.size());
		
		// 4. Map에서 데이터 꺼내기
		System.out.println("1번 키의 값은 = " + map.get("1"));
		
		// 5. Map에 저장된 모든 데이터를 한꺼번에 꺼내서 출력
		//	  1) map의 모든 키를 추출 (모든 key가 set에 담겨서 리턴)
		Set<String> keyset = map.keySet();
		//	  2) 반복문 안에서 키를 이용해서 map에서 데이터를 꺼내기
		for(String key : keyset) {
//			System.out.print(key + " ");
			int val = map.get(key);
			System.out.println("key : " + key + " value : " + val);
		}
//		if(map instanceof Iterable) {
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
	}

}
