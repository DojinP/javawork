package chap11.exception;

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
			//잔액이 부족한 경우 Exception이 발생할 수 있도록 처리하기
			//BankException을 만들어서 처리하기 - MyException과 동일하게 작업하기
			if(this.getBalance() < amount) {
				try {
					//예외를 발생시킨다
					throw new BankException("잔액이 부족합니다.");
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(!this.cardNo.equals(cardNo)){
				try {
					throw new BankException("카드번호 불일치");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("지불이 불가능합니다.");
		}
	}
}
