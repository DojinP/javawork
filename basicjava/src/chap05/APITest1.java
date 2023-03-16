package chap05;

import java.util.*;

import javax.swing.JFrame;

// API 사용방법
// -> API에서 제공하는 클래스를 메모리에 올리고 사용하는 방법
// -> API는 패키지로 구분되어 있다.
// -> API의 기본 패키지는 java.lang 패키지
// -> 컴파일러는 기본 패키지인 java.lang 패키지만 인식
// -> 나머지 패키지는 인식시켜야 한다.
// import 패키지명
public class APITest1 {
	public static void main(String[] args) {
		//String 클래스를 메모리에 할당하고 할당된 String 객체의 메소드를 호출
		String str = new String("문자열");
		str.charAt(0);
		
		//StringBuffer 클래스를 메모리에 할당하고 할당된 StringBuffer 클래스의 메소드를 호출
		StringBuffer sb = new StringBuffer();
		
		//Integer 클래스를 메모리에 할당하고 할당된 Integer 클래스의 메소드를 호출
		Integer in = new Integer(10);
		
		//Thread 클래스를 메모리에 할당하고 할당된 Thread 클래스의 메소드를 호출
		Thread t = new Thread();
		
		//Random 클래스를 메모리에 할당하고 할당된 Random 클래스의 메소드를 호출
		Random rand = new Random();
		
		//JFrame 클래스를 메모리에 할당하고 할당된 JFrame 클래스의 메소드를 호출
		JFrame frame = new JFrame();
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

}
