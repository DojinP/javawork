package chap08.oop.polyinterface;

public class Chicken extends Animal implements Cheatable {

	Chicken(int speed) {
		super(speed);
	}

	@Override
	public void fly() {
		this.speed *= 2;
	}

	@Override
	void run(int hours) {
		this.distance += this.speed * hours;
	}
}
