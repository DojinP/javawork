package thread.sync;

public class AccountSumThread extends Thread{
	Obj obj; // 공유객체

	public AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			synchronized (obj) {
				long tot = obj.acc2.getBalance() + obj.acc1.getBalance();
				System.out.println("총 잔액 => " + tot);	
			}
		}
	}
}
