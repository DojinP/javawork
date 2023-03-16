package chap07.oop.inheritance;

public class Beverage {
	private String type;
	private int price;
	
	public Beverage() {
		
	}
	
	public Beverage(String type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
