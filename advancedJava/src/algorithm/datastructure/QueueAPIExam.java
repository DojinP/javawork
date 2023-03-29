package algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;
//Queue에 1 ~ 10 데이터 추가
//꺼내어 합산 결과 출력
//[출력형식]
//큐:1
//큐:2
//...
//큐:10
//총합 : 55
public class QueueAPIExam {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		int cnt = 10;
		
		for (int i=1; i<=cnt; i++) {
			queue.add(i);
		}
		
		int tot = 0;
		
		for(int i=0; i<cnt; i++) {
			System.out.println("큐:"+queue.peek());
			tot += queue.poll();
		}
		
		System.out.println("총합 : "+tot);
	}
}
