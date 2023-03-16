package api.util.collection;

import java.util.Vector;

// 78, 99, 100, 95, 100 점을 Vector에 저장하고 저장된 점수들의 총점과 평균을 출력하기
// 제출
public class VectorExam01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		int tot = 0;
		double avg = 0.0;
		
//		int[] arr = new int[5];
		
		v.add(78);
		v.add(99);
		v.add(100);
		v.add(95);
		v.add(100);
		
		for (int data : v) {
			tot += data;		// v.get(i)
		}
		
		avg = tot / 5.0;
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
	}
}
