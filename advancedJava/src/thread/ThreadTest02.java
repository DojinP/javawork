package thread;

//class A implements Runnable {
//	
//}

public class ThreadTest02 {
	public static void main(String[] args) {
		// Thread t = new Thread(new A());
		// Runnable을 implements하는 이름이 없는 익명의 클래스를 정의하고 바로 생성
		// new Runnable(){
		//	===> Runnable의 하위 클래스를 바로 정의해서 생성
		//		 바로 정의해서 메모리에 올려 다른 클래스의 매개변수로 전달할 것이므로 이름이 필요없다.
		//		 익명 클래스(익명 이너 클래스)
		//	===> 람다, 안드로이드나 GUI프로그램 처럼 이벤트드리븐 방식의 코드를 구현할 시 주로 사용됨
		// }
		System.out.println("메인 시작");
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println("익명이너클래스");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		System.out.println("메인 종료");
	}
}
