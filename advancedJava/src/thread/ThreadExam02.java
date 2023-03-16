package thread;
/*
 * AlphaThread2, DigitThread2를 Runnable로 변경하여 작업하기
 * 
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

class AlphaThread2 extends Super implements Runnable {

	@Override
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class DigitThread2 extends Super implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			
			System.out.print(i);
			
			if(i%10 == 0) {
				System.out.println();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadExam02 {
	public static void main(String[] args) {
		AlphaThread2 at = new AlphaThread2();
		DigitThread2 dt = new DigitThread2();
		
		Thread t1 = new Thread(at, "t1");
		Thread t2 = new Thread(dt, "t2");
		
		t1.start();
		t2.start();
	}
}
