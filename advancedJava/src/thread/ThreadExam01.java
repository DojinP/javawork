package thread;
/*
 * 1. A~Z까지 출력하는 AlphaThread 작성
 * 	 = A to Z
 *   = 0.5초 sleep
 * 
 * 2. 1~100까지 출력하는 DigitThread 작성
 * 	 = 10개 출력 후 줄바꿈
 * 	 = 0.1초 sleep
 * 3. Main Thread
 *	  1번과 2번에서 작성한 클래스를 Thread로 실행하기
 *	
 *	결과, 파일 제출 
 */
class AlphaThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<26; i++) {
			char c = (char)('A'+ i);
			System.out.print(c);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class DigitThread extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			
			System.out.print(i);
			
			if(i%10 == 0) {
				System.out.println();
			}
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadExam01 {
	public static void main(String[] args) {
		AlphaThread at = new AlphaThread();
		DigitThread dt = new DigitThread();
		
		at.start();
		dt.start();
	}
}
