package chap07.oop.polydriver;

public class DriverTest {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver d = new Driver();
		
		//매개값으로 Bus 객체를 제공하고 drive() 메소드 호출
		Bus bus = new Bus();
		d.drive(bus);
		
		//매개값으로 Taxi 객체를 제공하고 drive() 메소드 호출
		Taxi taxi = new Taxi();
		d.drive(taxi);
	}
}
