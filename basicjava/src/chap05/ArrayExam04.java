package chap05;
// 배열을 메소드의 매개변수로 정의하고 사용할 수 있다.
public class ArrayExam04 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		ArrayExam04 obj = new ArrayExam04();
		
		System.out.println("(배열 ia)");
		obj.calcArr(ia);
		System.out.println("(배열 ib)");
		obj.calcArr(ib);
		
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
