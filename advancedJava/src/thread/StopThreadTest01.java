package thread;
/* 
 * 한 번 start 된 스레드는 절대 다시 실행할 수 없다.
 *  -> 일회성
 *  
 * [스레드를 종료]
 * 1. 임의의 변수를 선언해서 종료하는 방법
 *    ---------
 *      flag 변수
 *        - 변수에 저장된 값에 따라서 작업을 처리할 용도(실행 or 종료 - boolean, int변수...)
 *        - 변수 값을 체크 (오래걸리는 작업의 경우 중간에 stop 할 수 있다.)
 */
class StopThread extends Thread {
	// 현재 상태값을 저장할 수 있는 변수
	private boolean state = true;
	public void run() {
		while(state) {
			System.out.println("현재 스레드의 상태 : 실행중~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("현재 스레드의 상태 : 종료됨~~~~");
	}
	
	// 스레드의 현재 상태를 조절할 수 있는 변수를 변경하는 메소드
	public void StopThread() {
		state = false;
	}
}
public class StopThreadTest01 {
	public static void main(String[] args) {
		System.out.println("==========메인 스레드 시작===========");
		StopThread t1 = new StopThread();
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 스레드 실행을 제어하는 state 값을 변경하면서 스레드가 종료
		t1.StopThread();
		System.out.println("==========메인 스레드 종료===========");
	}
}
