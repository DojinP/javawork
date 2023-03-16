package chap07.oop.inheritance;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	// 지불금액이 내 잔액보다 <= , 카드번호가 일치
	// 무조건 문자열의 비교는 == 이 아니라 equals로 비교
	public void pay(long amount, String cardNo){
		if(this.cardNo.equals(cardNo) && this.getBalance() > amount) {
			this.setBalance(this.getBalance() - amount);
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
