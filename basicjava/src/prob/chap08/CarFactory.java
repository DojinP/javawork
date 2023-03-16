package prob.chap08;

public class CarFactory extends Factory implements IWorkingTogether {

	public CarFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int makeProducts(char skill) {
		// TODO Auto-generated method stub
		return 0;
	}

}
