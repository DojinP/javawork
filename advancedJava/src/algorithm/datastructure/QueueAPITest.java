package algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/*
    rear : 큐의 가장 끝 쪽 데이터가 삽입된 위치
	front : 큐의 가장 앞 쪽 데이터가 삽입된 위치
	add : 큐의 rear에 데이터를 삽입
	poll : front 부분에 저장된 데이터를 삭제
	peek : 큐의 맨 앞 부분. 즉, front의 테이터를 확인
	
	Queue의 상위 클래스 = LinkedList
*/

public class QueueAPITest {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		// 큐에 데이터 저장하기
		
		System.out.println(queue.add(1));	//저장공간이 있으면 true, 없으면 Exception을 발생
		System.out.println(queue.offer(2));	//저장공간이 있으면 true, 없으면 false를 발생
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println("size : " + queue.size());
		System.out.println(queue.poll());	//front의 요소를 꺼내고 결과 출력 (비어있으면 null)
		System.out.println(queue.remove());	//front의 요소를 꺼내고 결과 출력 (비어있으면 Exception)
		System.out.println("size : " + queue.size());
		System.out.println(queue.poll());	
		System.out.println(queue.remove());
		System.out.println("size : " + queue.size());
//		System.out.println(queue.poll());	// null 출력
//		System.out.println(queue.remove());	// nosuchElements 예외 출력
	}
}
