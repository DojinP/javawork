package chap05;

public class Chap05_Q7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("최대값은 " + max);
	}
}
