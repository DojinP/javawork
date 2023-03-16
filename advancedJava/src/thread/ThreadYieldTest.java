package thread;
class MyThread4 implements Runnable {
	boolean flag;
	
	@Override
	public void run() {
		while(true) {
			if(flag) {
				Thread.yield();
			}else {
				System.out.println(Thread.currentThread().getName()+"실행");
				for(int i=1; i<=1000000000; i++) {
				}
			}
		}
	}
	
}
// 1. t1과 t2 스레드가 flag = false 인 동안은 else절만 실행되어 두 스레드가 번갈아 실행된다.
// 2. t2의 flag를 true로 바꾸면서 t2가 if 절을 실행하며, t2가 모든 실행제어를 t1에게 넘기어 t1만 실행된다.
// 3.


public class ThreadYieldTest {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new MyThread4());
		MyThread4 obj1 = new MyThread4();
		Thread t1 = new Thread(obj1);
		t1.setName("t1");
		obj1.flag = false;
		t1.setDaemon(true);	// 데몬 쓰레드로 변경 (메인 쓰레드가 종료되면 같이 종료되는 쓰레드)
		t1.start();
		
		MyThread4 obj2 = new MyThread4();
		Thread t2 = new Thread(obj2);
		t2.setName("t2");
		obj2.flag = true;
		t2.setDaemon(true);	// 데몬 쓰레드로 변경 (메인 쓰레드가 종료되면 같이 종료되는 쓰레드)
		t2.start();
		
		for(int i=1; i<=6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// !연산자는 boolean 변수의 값을 invert
			// true -> false
			// false -> true
			// 각 스레드의 flag 값을 1초마다 변경해주는 코드
			
			
			obj1.flag = !obj1.flag;
			obj2.flag = !obj2.flag;
		}
	}
}
