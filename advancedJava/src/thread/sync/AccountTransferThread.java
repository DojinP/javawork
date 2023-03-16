package thread.sync;

public class AccountTransferThread extends Thread {
	Obj obj;	// 공유 객체
	
	public AccountTransferThread(Obj obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			// sync 블럭 안의 작업이 완료되기 전까지 다른 쓰레드에서 공유객체에 접근할 수 없다.
			// synchronized 블럭의 () 안의 매개변수는 공유객체를 명시
			synchronized (obj) {
				obj.acc2.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc1.deposit(1000000);
				System.out.println("100만원을 입금했습니다.");	
			}
			
		}
	}
}
