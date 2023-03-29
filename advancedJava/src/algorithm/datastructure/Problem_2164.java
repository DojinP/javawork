package algorithm.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_2164 {
	public static int lastCard(int N) {
		Queue<Integer> queue = new LinkedList<>();
		
		// 초기화
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		// Logic
		while(queue.size() != 1) {	// 카드 1장 남을 때까지
			queue.remove();		// 맨 위 카드 1장 제거
			int mvCard = queue.poll(); // 바닥으로 보낼 카드 저장
			queue.add(mvCard);	// 카드 바닥으로 보냄
		}
		
		// result
		return queue.poll();
		
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(lastCard(N));
	}
}
