package algorithm.datastructure;

import java.util.Stack;

// 1 ~ 10 데이터 추가
// 꺼내어 합산 결과 출력
// [출력형식]
// 스택:1
// 스택:2
// ...
// 스택:10
// 총합 : 55
public class StackAPIExam {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=10; i++) {
			stack.push(i);
			System.out.println("스택:"+i);
		}
		
		int tot = 0;
		
		while(!stack.empty()) {
			tot += stack.pop();
		}
		
		System.out.println("총합:" + tot);
	}
}
