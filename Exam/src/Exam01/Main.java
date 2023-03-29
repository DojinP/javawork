package Exam01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Car> arrList = new ArrayList<>();
		
		arrList.add(new Taxi(new Point(7, 5), 100, 1900));
		arrList.add(new Truck(new Point(10, 12), 80, 2000));

		for(int i=0; i<arrList.size(); i++) {
			arrList.get(i).run(i+1);
		}
		
//		for (Car car : arrList) {
//			car.run(1);
//		}
		
		Car.printTitle();
		
		for (Car car : arrList) {
			car.print();
		}
		
	}
}
