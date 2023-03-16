package chap08.oop.polyinterface;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		// Chicken Object가 Cheatable 하다면 fly 함수를 호출합니다.
		if(cheatableChicken instanceof Cheatable){
			cheatableChicken.fly();
		}
		
		// 코드 구현
		for(int i=1; i<=3; i++) {
			System.out.println(i+"시간 후");
			
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			
			System.out.print("개의 "); dog.print(); 
			System.out.print("닭의 "); chicken.print();
			System.out.print("날으는 닭의 "); cheatableChicken.print();
		}
	}
}












