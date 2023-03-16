package chap08.oop.polyinterface;

public class Dog extends Animal {

	Dog(int speed) {
		super(speed);
	}

	@Override
	void run(int hours) {
		this.distance += this.speed * ((double)hours/2);
	}
}
