package chap05;
// 배열의 사용 - 배열의 선언, 생성, 초기화
public class ArrayTest01 {
	public static void main(String[] args) {
		// 1. 배열의 선언 
		//   - 배열의 참조할 변수를 정의하는 과정
		//   - int형의 데이터를 저장할 수 있는 배열변수 선언
		// [형식]
		// 데이터타입[] 변수명
		
		int[] myArr;
		
		// 2. 배열의 생성
		//   => 실제 데이터를 저장할 수 있는 구조를 만드는 과정
		//   => 생성된 배열은 힙에 할당된다.
		//   =>
		// [형식]
		// new 배열에저장될데이터의타입[생성될요소의개수]
		// int 데이터가 5개 저장될 수 있는 배열 생성(5개의 요소를 갖는 배열 생성)
		myArr = new int[5];
		int[] myArr2 = new int[3];
		int[] myArr3 = null;
		
		System.out.println(myArr);
		System.out.println(myArr2);
		System.out.println(myArr3);
		
		// myArr가 참조하는 배열의 0번 요소를 출력
		System.out.println(myArr[0]);
	}
}
