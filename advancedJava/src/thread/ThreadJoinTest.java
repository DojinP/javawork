package thread;

class Thread3_1 extends Thread {
	@Override
	public void run() {
		// 네트워크로 데이터를 받아오는 쓰레드
		for(int i=1; i<=1000000000; i++) {
			
		}
	}
}

class Thread3_2 extends Thread {
	Thread t;
	
	public Thread3_2(Thread t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		try {
			// join을 호출한 Thread3_2 쓰레드를 3초간 일시정지 상태로 변경
			// t 쓰레드가 3초 동안 CPU를 독점사용하도록 처리
			// Thread3_2 가 Thread3_1 작업 후에 처리를 해야하거나 
			// Thread3_1에서 발생된 결과를 가지고 실행해야하는 경우
			t.join(3000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
			System.out.println("인터럽트 발생!!!");
		}
		// 네트워크연결 작업을 표현해놓은 시간 지연 코드
		for(int i=1; i<=1000000000; i++) {
			
		}
	}
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		Thread3_1 t1 = new Thread3_1();
		Thread3_2 t2 = new Thread3_2(t1);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.getName() + " 상태 : " + t1.getState());
		System.out.println(t2.getName() + " 상태 : " + t2.getState());
		
		// t2 쓰레드의 실행을 중간에 멈추기 위해 인터럽트를 발생시킨다.
		t2.interrupt();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.getName() + " 상태 : " + t1.getState());
		System.out.println(t2.getName() + " 상태 : " + t2.getState());
	}
}
