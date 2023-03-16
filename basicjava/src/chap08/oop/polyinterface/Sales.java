package chap08.oop.polyinterface;

public class Sales extends Employee implements Bonus{

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(1.2 * pay));
	}

	@Override
	public double tax() {
		return 0.13 * getSalary();
	}
	
}
