package Exam01;

public class Taxi extends Car {

	private int taxifare;
	
	public Taxi() {
		super();
	}

	public Taxi(Point point, int speed) {
		super(point, speed);
	}
	
	public Taxi(Point point, int speed, int taxifare) {
		super(point, speed);
		this.taxifare = taxifare;
	}

	@Override
	public void run(int hour) {
		distance = getSpeed() * hour;
	}

	@Override
	public double calcToll() {
		double ret = distance * getTaxifare() * 0.023; // 2.3% 부과
		return ret;
	}

	@Override
	public void print() {
		System.out.println("택시\t" + getSpeed() + "\t" + getDistance() + "\t\t"
				+ getPoint().getX() + "\t" + getPoint().getY() + "\t" + calcToll());
	}

	public int getTaxifare() {
		return taxifare;
	}

	public void setTaxifare(int taxifare) {
		this.taxifare = taxifare;
	}

}
