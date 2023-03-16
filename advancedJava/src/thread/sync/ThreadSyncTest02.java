package thread.sync;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		// 공유객체 생성
		Obj obj = new Obj();
		
		obj.acc1 = new Account("111-222-333", 10000000, "김서연");
		obj.acc2 = new Account("777-777-777", 50000000, "BTS");
		
		// 쓰레드 생성
		AccountTransferThread transfer = new AccountTransferThread(obj);
		AccountSumThread sum = new AccountSumThread(obj);
		
		transfer.start();
		sum.start();
	}
}
