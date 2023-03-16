package api.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exam {

	public static void main(String[] args) {

		Board b1 = new Board(1, "김김김", "안녕1", "안녕하세요1");
		Board b2 = new Board(2, "이이이", "안녕2", "안녕하세요2");
		Board b3 = new Board(3, "박박박", "안녕3", "안녕하세요3");
		Board b4 = new Board(4, "최최최", "안녕4", "안녕하세요4");
		Board b5 = new Board(5, "강강강", "안녕5", "안녕하세요5");
	
		ArrayList<Board> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		HashSet<Board> set = new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		HashMap<Integer, Board> map = new HashMap<>();
		map.put(b1.getNum(), b1);
		map.put(b2.getNum(), b2);
		map.put(b3.getNum(), b3);
		map.put(b4.getNum(), b4);
		map.put(b5.getNum(), b5);
		
//		CollectionExam.arrayPrint(list);
//		CollectionExam.setPrint(set);
//		CollectionExam.mapPrint(map);
		
		CollectionExam.printCollection(list);
		CollectionExam.printCollection(set);
		
		
	}

}
