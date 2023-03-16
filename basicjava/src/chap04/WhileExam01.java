package chap04;
// for문으로 표현했던 코드를 변환해보기
// 1부터 100까지의 총합, 홀수합, 짝수합 구해서 출력하는 코드를 변환
public class WhileExam01 {
	public static void main(String[] args) {
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		int cnt = 1;
		while(cnt <= 100) {
			if(cnt % 2 == 1) {
				oddsum += cnt;
			}else {
				evensum += cnt;
			}
			sum += cnt;
			cnt++;
		}
		System.out.println("전체합:"+sum);
		System.out.println("홀수합:"+oddsum);
		System.out.println("짝수합:"+evensum);
	}
}
