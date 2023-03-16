package api.lang;

public class Vehicle {
	Owner owner;	// Vehicle 객체가 Owner 객체를 소유 (has a 관계)
	int price;
	
	@Override
	public boolean equals(Object obj) {
		Vehicle v = (Vehicle)obj;
		if(this.owner.equals(v.owner)){
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "소유주정보 : " + owner + "\n차량정보 : 가격은 " + price + " 입니다.";
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
