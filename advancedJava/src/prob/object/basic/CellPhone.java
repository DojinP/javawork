package prob.object.basic;
// 기본객체 Ex05
public class CellPhone {
	String model;
	double battery;
	
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	
	public void call(int time) throws IllegalArgumentException {
		
		if(time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}

		System.out.println("통화 시간 : " + time + "분");
		
		battery -= time * 0.5;
		
		if(battery < 0) {
			battery = 0;
		}
		
	}
	
	public void charge(int time) {
		
		if(time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		
		System.out.println("충전 시간 : " + time + "분");
		
		battery += time * 3;
		
		if(battery > 100) {
			battery = 100;
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : " + battery );
	}
	
	@Override
	public boolean equals(Object otherObject) {

		CellPhone c = (CellPhone)otherObject;
		
		if(otherObject instanceof CellPhone && this.model == c.model ) {
			return true;
		}else {
			return false;			
		}
	}
}
