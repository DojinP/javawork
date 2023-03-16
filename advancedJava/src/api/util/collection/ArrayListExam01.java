package api.util.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// 1부터 50까지 랜덤수를 6개 발생시켜서 ArrayList에 저장하고 출력형식대로 출력하세요
// ex) 랜덤수 5, 7, 9, 13, 40
// 5(홀수), 7(홀수), 9(홀수), 13(홀수), 40(짝수)
// 완료 후 제출
public class ArrayListExam01 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			al.add((rand.nextInt(50) + 1));
		}

		String result = "";

		for (int i = 0; i < al.size(); i++) {
			result += al.get(i);
			if (al.get(i) % 2 == 1) {
				result += "(홀수),";
			} else {
				result += "(짝수),";
			}
		}

		result = result.substring(0, result.length() - 1); // 마지막 , 제거

		System.out.println(result);
	}
}
