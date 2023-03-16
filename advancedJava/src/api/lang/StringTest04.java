package api.lang;
// 데이터 변환
public class StringTest04 {
	public static void main(String[] args) {
		String str = "java programming";
		String str2 = new String("java myslql html5 css javascript jquery");
		
		// 1. String -> byte[]
		byte[] data1 = str.getBytes();
		for(byte b : data1) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		
		// 2. String -> char[]
		char[] data2 = str.toCharArray();
		for(int i=0; i<data2.length; i++) {
			System.out.print(data2[i]);
		}
		
		System.out.println();
		
		// 3. String -> String[]
		String[] data3 = str2.split(" ");
		for(String s : data3) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		// 4. 기본형 -> String
		
		int i = 1000;
		double d = 10.5;
		test(String.valueOf(i));
		test(String.valueOf(d));
		test(i+"");
		test(d+"");
	}
	public static void test(String data) {
		System.out.println("전달받은 데이터 =>" + data);
	}
}
