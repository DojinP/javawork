package thread;

/*
 * 자바에서 Thread 프로그래밍 하는 방법
 * 1. Thread 클래스를 상속받아 작업
 *   1) Thread 클래스를 상속
 *   2) run 메소드를 오버라이딩해서 Thread로 실행하고 싶은 내용을 구현.
 *   						  ------------------------
 *   							동시 실행 흐름으로 처리하고 싶은 기능
 *     => run 메소드를 직접 호출하지 않는다
 *   3) Thread 클래스에 정의된 start 메소드를 호출한다.
 *   	=> start메소드를 호출하면 JVM 내부에   (&^#@%$^(%*&^(!&%^!%(*#& 주석문 못적음)
 *   	 +++pri) Thread 객체의 start() 메소드를 사용하면 해당 객체는 JVM의 쓰레드 스케줄링 대상이되어 Runnable 상태에 돌입. 한 번 New 상태에 돌입한 Thread는 다시 New 상태가 될 수 없음
 * 2. Runnable 인터페이스의 하위 클래스를 작성하고 이를 이용해서 Thread 클래스를 생성하는 방법
 * 
 */
// ThreadDemo01 클래스를 Thread로 처리
class ThreadDemo01 extends Thread {
	// 생성자를 정의해서 각 Thread의 이름을 설정할 수 있도록 정의
	ThreadDemo01(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=20; i++	) {
			// Thread 클래스의 getName() 메소드를 호출해서 생성할 때 설정한 Thread의 이름을 같이 출력하기
			System.out.print(i + "("+ getName() + ")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}

}

public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("*********메인스레드 시작**********");
		ThreadDemo01 thread1 = new ThreadDemo01("Thread1");
		ThreadDemo01 thread2 = new ThreadDemo01("Thread2");
//		thread1.run(); // 
//		thread2.run(); // ----- 쓰레드 작업이 아닌 단순 method 콜
		thread1.start();;
		thread2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main Thread");
			try {
				Thread.sleep(200); // 0.2초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*********메인스레드 종료**********");
	}
}
