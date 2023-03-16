package api.util.collection;

import java.util.ArrayList;

// 배열을 ArrayList로 변환해서 리턴하는 메소드를 정의
// 메소드명 : changeArrayList
// 매개변수 : String[]
// 리턴타입 : ArrayList<String>
public class ArrayListExam02 {
	public static void main(String[] args) {
		String[] strArr = {"java", "servlet", "jsp", "spring"};
		// 2. 1번에서 구현한 changeArrayList 메소드를 호출
		ArrayList<String> resultList = changeArrayList(strArr);
		
		// 3. 호출결과로 리턴받은 ArrayList에 저장된 요소를 출력하기
		for(int i=0; i<resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
	}
	
	// 1. changeArrayList 메소드 정의
	//  - static 메소드로 작성하고 매개변수로 전달받은 배열을 ArrayList로 변환해서 리턴하기
	
	public static ArrayList<String> changeArrayList(String[] str){
		
		ArrayList<String> alist = new ArrayList<String>();
		
		for(String token : str) {
			alist.add(token);
		}
		
		return alist;
	}
}
