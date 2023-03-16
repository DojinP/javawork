package chap05;

public class APITest2 {

	public static void main(String[] args) {
		String str = new String("java");
		//str 변수가 갖고 있는 heap에 할당된 String 객체의 주소를 참조해서
		//String 클래스의 기능인 charAt을 호출
		
		//API에 포함된 클래스의 메소드를 호출하는 경우 리턴값이 있는 경우 리턴타입과
		//같은 타입의 변수를 선언해서 사용해야한다.
		char result = str.charAt(3);
		System.out.println("0번째 문자 : " + result);
	}

}
