package chap11.exception;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
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
