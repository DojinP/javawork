package api.util.collection;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExam {
	public static void arrayPrint(List<Board> list) {
		for (Board board : list) {
			boardInfo(board);
		}
	}
	
	public static void setPrint(Set<Board> set) {
		for (Board board : set) {
			boardInfo(board);
		}
	}
	
	public static void mapPrint(Map<Integer, Board> map) {
		Set<Integer> keyset = map.keySet();
		for(int key : keyset) {
			Board b = map.get(key);
			boardInfo(b);
		}
	}
	
	public static void printCollection(Collection<Board> col) {
		for(Board board : col) {
			boardInfo(board);
		}
	}
	
	public static void boardInfo(Board board) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String time = sdf.format(board.getDate());
		System.out.printf("번호: %d 이름 : %s 작성시간 : %s 제목 : %s 내용 : %s\n", 
				board.getNum(), board.getName(), time, board.getTitle(), board.getContent());
	}
}
