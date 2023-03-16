package thread;

/*
 * 스레드 종료
 * 2. 인터럽트를 발생시키고 현재 상태를 확인한 후 작업하기
 */
class StopThread2 implements Runnable  {
	@Override
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("현재 스레드 상태 : 실행 중");
				Thread.sleep(500); 
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		} finally{
			System.out.println("현재 스레드 상태 : 종료");
		}
		
	}
}

public class StopThreadTest02 {
	public static void main(String[] args) {
		System.out.println("==========메인 스레드 시작===========");
		Thread t = new Thread(new StopThread2());
		t.start();
		System.out.println("스레드 이름 : " + t.getName());
		System.out.println("인터럽트 상태 : " + t.isInterrupted());
		System.out.println("인터럽트 상태 : " + t.isInterrupted());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 인터럽트 발생
		t.interrupt();
		System.out.println("인터럽트 상태 : " + t.isInterrupted());
		System.out.println("인터럽트 상태 : " + t.isInterrupted());
		System.out.println("==========메인 스레드 종료===========");
	}
}
