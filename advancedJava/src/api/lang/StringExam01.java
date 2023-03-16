package api.lang;

public class StringExam01 {
	public static void main(String[] args) {
		String str = "java";
		// str 문자열이 다음과 같이 출력되도록 작업
		// [형식]
		// AVAJ
		
//		String result = "";
//		for(int i=0; i<str.length(); i++) {
//			result += str.charAt((str.length()-1)-i);
//		}
//		result = result.toUpperCase();
//		System.out.println(result);
		
		int size = str.length()-1;
		
		str = str.toUpperCase();
		
		for(int i=size; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}
