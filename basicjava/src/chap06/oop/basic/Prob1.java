package chap06.oop.basic;
// 배열을 메소드의 매개변수로 정의하고 사용할 수 있다.
public class Prob1 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		Prob1 obj = new Prob1();
		
		System.out.println("(배열 ia)");
		obj.calcArr(ia);
		System.out.println("(배열 ib)");
		obj.calcArr(ib);
		
		int[] myArr = obj.getData();
		for(int i : myArr) {
			System.out.println(i);
		}
	}
	
	// 1부터 10까지의 홀수를 리턴하는 메소드
		public int[] getData() {
			// 리턴 값이 여러개인 경우 배열에 담아서 리턴
			//         -----
			//       모두 타입이 동일한 경우
			int[] arr = new int[10];
			int index = 0;
			
			for(int i=1; i<=10; i++) {
				if(i%2 == 1) {
					arr[index] = i;
					index++;
				}
			}
			
			return arr;
		}
	
	// 매개변수로 배열을 정의
	public void calcArr(int[] myArr) {
		// 배열의 합을 구해서 출력
		int oddsum = 0;
		int evensum = 0;
		
		for(int i=0; i<myArr.length; i++) {
			if(myArr[i] % 2 == 1) {	// 홀수
				oddsum += myArr[i];
			}else {
				evensum += myArr[i];
			}
		}
		
		System.out.println("홀수의 합 : " + oddsum);
		System.out.println("짝수의 합 : " + evensum);
	}

}
