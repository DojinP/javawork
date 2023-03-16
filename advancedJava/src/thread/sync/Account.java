package thread.sync;

public class Account {
	private String accId;		// 계좌번호
	private long balance;		// 잔액
	private String ownerName;	// 예금주
	
	public Account() {
		
	}
	
	public Account(String accId, long balance, String ownerName) {
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	public void deposit(long amount) {
		this.balance += amount;
	}
	
	public void withdraw(long amount) {
		if(this.balance > amount) {
			this.balance -= amount;
		}else {
			System.out.println("잔고가 부족합니다.");
		}
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}
