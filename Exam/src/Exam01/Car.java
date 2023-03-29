package Exam01;

public abstract class Car {
	private Point point;
	private int speed;
	protected double distance;
	
	public Car() {
		
	}
	
	public Car(Point point, int speed) {
		this.point = point;
		this.speed = speed;
	}
	
	// distance 계산하는 메소드
	public abstract void run(int hour);
	
	// 통행요금을 계산해서 리턴하는 메소드
	public abstract double calcToll();
	
	// 출력형식과 같이 객체의 값을 출력하는 메소드
	public abstract void print();
	
	// title을 출력하는 static 메소드
	public static void printTitle() {
		System.out.println("차종\tspeed\tdistance\tx좌표\ty좌표\t요금");
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
