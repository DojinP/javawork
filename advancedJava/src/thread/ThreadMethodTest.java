package thread;

public class ThreadMethodTest {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("쓰레드 이름 : " + t.getName());
		// 작업 중인 쓰레드 개수
		System.out.println("실행 중인 쓰레드의 개수 : " + Thread.activeCount());
		// 아무 일도 하지 않는 쓰레드 만들기
		for(int i=1; i<=3; i++) {
			Thread t2 = new Thread();
			System.out.println(t2.getName());
			t2.start();
		}
		for(int i=1; i<=3; i++) {
			Thread t2 = new Thread("t" + i);
			System.out.println(t2.getName());
			t2.start();
		}
		for(int i=1; i<=3; i++) {
			Thread t2 = new Thread();
			System.out.println(t2.getName());
			t2.start();
		}
		System.out.println("현재까지 실행 중인 쓰레드 개수 : " + Thread.activeCount());
	}
}
