package thread;

class MyThread5 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 일반스레드는 메인스레드와 상관없이 자신의 작업이 종료되어야 종료
// 데몬스레드로 만드는 작업을 하면 메인스레드가 종료되면 스레드가 종료되도록 작업할 수 있다.
// start 하기 전에 작업해야 한다.
public class DeamonThreadTest {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		MyThread5 t = new MyThread5();
		t.setDaemon(true);
		t.start();
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인스레드 종료");
	}
}
