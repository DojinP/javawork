package api.util.collection;

import java.util.HashSet;

// 합집합과 교집합
public class HashSetTest02 {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		set1.add("java");
		set1.add("mysql");
		set1.add("servlet");
		set1.add("jdbc");
		set1.add("jsp");
		set1.add("spring");
		set1.add("css");
		print(set1);

		//합집합 - Set을 생성할 때 매개변수로 또다른 Set을 넘기기
		HashSet<String> set2 = new HashSet<>(set1);
		set2.add("hadoop");
		set2.add("spark");
		set2.add("flume");
		print(set2);

		HashSet<String> set3 = new HashSet<>();
		set3.add("java");
		set3.add("servlet");
		set3.add("python");
		set3.add("Raspberry PI");
		print(set3);
		
		System.out.println("set1과 set3의 교집합 - 교집합이 set3에 새로 설정");
//		set3.retainAll(set1);
		print(set3);

		System.out.println("set2와 set3의 합집합");
		set2.addAll(set3);
		print(set2);
		
	}

	public static void print(HashSet<String> set) {
		// TODO Auto-generated method stub
		for(String data : set) {
			System.out.println(data);
		}
		System.out.println("-------------------------------------------");
	}

	
	
}
