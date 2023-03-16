package chap04;
// break문 : switch문과 반복문을 빠져나온다. 단, break 문이 선언된 블럭에서만 빠져나온다.
public class GuGuExam_Continue {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
//			if(dan==5) {
//				continue;
//			}
			for(int dan=2; dan<=9; dan++) {
				if(dan==5) {
					continue;
				}
				System.out.print(dan+"*"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}
}
