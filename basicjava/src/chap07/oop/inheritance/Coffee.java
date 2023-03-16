package chap07.oop.inheritance;

public class Coffee extends Beverage {
	private String name;

	public Coffee() {
		
	}
	
	public Coffee(String type, int price, String name) {
		super(type, price);
		this.name = name;
	}
	
	public void print() {
		System.out.println("타입:"+getType()+",이름:"+name+",가격:"+getPrice());
//		System.out.println("타입:"+getType()+",이름:"+getName()+",가격:"+getPrice());

	}
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}
