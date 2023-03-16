package chap04;
// switch 문의 특징
public class SwitchTest03 {

	public static void main(String[] args) {
		int data = 10;
		double data2 = 10.0; // 안됨, float도 안됨
		short data3 = 10;
		long data4 = 10;	// 안됨
		String data5 = new String("01"); // 지원한지도 얼마 안됨
		switch(data5) {
		case "01":
			System.out.println("완료");
		}
		
		char data6 = 'a';
		switch(data6) {
		case 'a':
			System.out.println("완료");
			
		}
	}

}
