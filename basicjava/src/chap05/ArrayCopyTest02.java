package chap05;

// 배열의 사이즈를 변경하는 작업 - System 클래스의 arraycopy 메소드를 활용해서 작업하기
public class ArrayCopyTest02 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		// 배열에 값을 할당하기 위한 for문
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = 10 + i;
		}
		// 배열에 저장된 값을 출력하기 위한 for문
		for (int i = 0; i < firstArr.length; i++) {
			System.out.print(firstArr[i] + " ");
		}
		System.out.println();
		
		// 배열의 사이즈를 변경
		// 1. 새로운 배열을 생성
		int[] secondArr = new int[firstArr.length*3];
		// 2. 기존배열을 새로운 배열에 copy 하도록 지원되는 System 클래스의 arraycopy 메소드를 호출해서 작업
		// System.arraycopy(firstArr, 0, secondArr, 0,  0);
		// 					-------- --- --------- --- ---
		//                 copy원본배열 시작위치  |	  타깃시작위치  \ copy 요소의 개수
		// 									타깃배열
		//System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		System.arraycopy(firstArr, 2, secondArr, 2, 2);
		// 3. 복사된 배열을 확인
		for(int i=0; i<secondArr.length; i++) {
			System.out.print(secondArr[i] + " ");
		}
		System.out.println();
	}
}
