package chap08.oop.polyinterface;

public class Secretary extends Employee implements Bonus{

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(0.8 * pay));
	}

	@Override
	public double tax() {
		return 0.1 * getSalary();
	}
	
}
