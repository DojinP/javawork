package prob.chap07;

public class Account {
	private String accNo;
	private int balance;
	
	public Account() {
		
	}
	
	// 입금
	public void save(int money) {
		balance += money;
		System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다..");
	}
	
	// 출금
	public void deposit(int money) {
		balance -= money;
		System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다..");
	}
	
	// 잔고 확인
	public int getBalance() {
		return balance;
	}
	
	
	// 계좌 번호 확인
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
