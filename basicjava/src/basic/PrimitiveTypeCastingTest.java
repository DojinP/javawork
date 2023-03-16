package basic;
// 기본형 데이터의 타입캐스팅(형변환)
public class PrimitiveTypeCastingTest {
	public static void main(String[] args) {
		// 1. 자동형변환 - JVM 내부에서 자동으로 변환
		byte b = 100;
		short s = b; // 형변환
		int i = s;
		long l = i;
		System.out.println("값:"+l);
		
		float f = l;
		System.out.println("값:"+f);
		
		double d = f;
		System.out.println("값:"+d);
		
		char c = 'A';
		System.out.println("char값:"+c);
		int data = c;
		System.out.println("chartoint값:"+data);
		
		int data2 = 97;
		System.out.println((char)data2);
		
		int data3 = 100;
		char chardata = (char)data3;
		System.out.println(chardata);
		
		double result = 10/3;
		System.out.println("결과=>"+result);
		System.out.println(30/100*100+"%");
	}
}
