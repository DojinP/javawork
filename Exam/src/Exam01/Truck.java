package Exam01;

public class Truck extends Car {

	private int weight;
	
	public Truck() {
		super();
	}

	public Truck(Point point, int speed) {
		super(point, speed);
	}
	
	public Truck(Point point, int speed, int weight) {
		super(point, speed);
		this.weight = weight;
	}

	@Override
	public void run(int hour) {
		setDistance(getSpeed() * hour * 0.7);	// 입력된 시간의 70%만 이동
	}

	@Override
	public double calcToll() {
		double ret = getDistance() * getWeight() * 0.12;	// 12% 부과 
		return ret;
	}

	@Override
	public void print() {
		System.out.println("트럭\t" + getSpeed() + "\t" + getDistance() + "\t\t"
				+ getPoint().getX() + "\t" + getPoint().getY() + "\t" + calcToll());
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
