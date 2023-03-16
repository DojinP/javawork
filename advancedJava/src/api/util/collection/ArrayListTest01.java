package api.util.collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import api.lang.Person;

public class ArrayListTest01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();	
	
		list.add(10);							
		System.out.println("현재 ArrayList에 저장된 요소의 개수 => " + list.size());
		
		for (int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println("현재 ArrayList에 저장된 요소의 개수 => " + list.size());

		System.out.println("1번 요소에 저장된 값 => " + list.get(1));
		
		for (int i=0; i<list.size(); i++) {
			int data = list.get(i);
			System.out.println(i+"번째 요소 => " + data);
		}
		
//		list.remove(0);	// out of bound exception
		list.set(10, 100);
		list.remove(0);
		
		for (int data2 : list) {
			System.out.println("ArrayList에 저장된 데이터 => " + data2);
		}
		
		
		// HashMapTest
		if(list instanceof Iterable) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
	}

}
