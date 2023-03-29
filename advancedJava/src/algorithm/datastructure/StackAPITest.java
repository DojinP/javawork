package algorithm.datastructure;

import java.util.Stack;

// Stack
// 한 쪽 끝에서만 데이터를 넣고 뺄 수 있는 자료구조
// peek : 마지막으로 저장된 요소 확인
// push : input
// pop : output
// top : 가장 위 데이터 조회
// empty : 비어있는지 여부 조회
// size : 저장된 스택의 사이즈 출력
public class StackAPITest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		// 스택에 데이터 넣기
		stack.push("java");
		stack.push("mysql");
		stack.push("jdbc");
		System.out.println("스택에 저장된 요소의 개수 : " + stack.size());
		System.out.println("스택에 저장된 요소가 있나요? : " + stack.empty());	// 저장된 요소가 하나라도 있으면 false 반환
		System.out.println("스택에 마지막으로 저장된 요소를 확인 : " + stack.peek());
		System.out.println("스택에 저장된 요소의 개수 : " + stack.size());
		System.out.println("스택에서 데이터 꺼내기 : " + stack.pop());
		System.out.println("스택에 저장된 요소의 개수 : " + stack.size());
		System.out.println("스택에서 데이터 꺼내기 : " + stack.pop());
		System.out.println("스택에서 데이터 꺼내기 : " + stack.pop());
		System.out.println("스택에 저장된 요소의 개수 : " + stack.size());
		System.out.println("스택에 저장된 요소가 있나요? : " + stack.empty());
		// 스택이 비었을 때 peek 호출
		System.out.println("스택에 마지막으로 저장된 요소를 확인 : " + stack.peek());	// - java.util.EmptyStackException 발생
		
	}

}
