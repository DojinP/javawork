package thread.sync;

public class Toilet {
	// synchronized를 메소드 앞에 정의하면
	// 하나의 쓰레드가 이 객체의 메소드를 호출하는 동안 다른 쓰레드는 접근할 수 없도록 잠금처리를 메소드 전체에 적용
	
	// 메소드의 외부에서 처리하는 경우
	/*
	 * synchronized(공유객체){
	 * 	// 동시접속에 대한 처리를 코드로 정의
	 * }	
	 */
	public synchronized void open(String name) {	// name은 공유객체를 사용하는 쓰레드의 이름
		System.out.println(name + "이 문열고 들어옴");
		for (int i = 1; i < 100000000; i++) {
			if(i==10000) {
				System.out.println(name + "이 볼일을 봄");
			}
		}
		System.out.println(name + "이 문열고 나감");
	}
}
