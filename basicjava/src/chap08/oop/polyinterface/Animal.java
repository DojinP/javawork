package chap08.oop.polyinterface;

public abstract class Animal {
	int speed;			// 속도 km/h
	double distance;	// 이동거리 km
	
	Animal(int speed){
		this.speed = speed;
	}
	
	abstract void run(int hours);
	
	double getDistance() {
		return distance;
	}
	
	void print() {
		System.out.println("이동거리=" + getDistance());
	}
}
