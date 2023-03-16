package api.lang;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("BTS", "서울", 301);
		Person p2 = new Person("BTS", "서울", 30);
		
		if(p1 == p2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p2);
		System.out.println(p2.hashCode());
	
		System.out.println(p1.getName()+", "+p1.getAddr()+", "+p1.getAge());
		System.out.println(p2.getName()+", "+p2.getAddr()+", "+p2.getAge());
		
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p2.toString());
		
		System.out.println(p1.getClass());
	}

}
