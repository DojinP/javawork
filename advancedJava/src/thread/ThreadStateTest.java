package thread;
class MyThread2 extends Thread {
	public void run() {
		for(int i=1; i<=100000000; i++) {
			
		}
	}
}
public class ThreadStateTest {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		System.out.println("쓰레드 상태 : " + t.getState());
		t.start();
		System.out.println("쓰레드 상태 : " + t.getState());
//		System.out.println("쓰레드 상태 : " + t.getState());
//		System.out.println("쓰레드 상태 : " + t.getState());
//		System.out.println("쓰레드 상태 : " + t.getState());
//		System.out.println("쓰레드 상태 : " + t.getState());
		// WAITING 상태
		// join을 호출한 쓰레드의 상태를 일시정지 상태로 만들기
		// > main 쓰레드를 일시정지 상태로 만들고 t 쓰레드 작업이 완료될 때까지 대기
		try {
			t.join();	// main 쓰레드는 실행이 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// t 쓰레드의 작업이 종료될 때까지 main 쓰레드가 일시 정지 상태이므로 t의 상태는 무조건 Terminated
		System.out.println("쓰레드 상태 : " + t.getState());
	}
}
