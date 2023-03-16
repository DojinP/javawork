package api.lang;
// String 클래스의 중요 메소드 살펴보기
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("Java Programming");
		String str2 = "재밌다";
		
		System.out.println("str1.charAt(1) => " + str1.charAt(1));
		System.out.println("str1.concat(str2) => " + str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.indexOf('a') => " + str1.indexOf('a'));
		System.out.println("str1.indexOf(\"합\") => " + str1.indexOf("합"));
		System.out.println("str1.lastIndexOf('a') => " + str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexOf(\"합\") => " + str1.lastIndexOf("합"));
		System.out.println("str1.length() => " + str1.length());
		System.out.println("===========================================");
		
		// equals 와 equalsIgnoreCase는 문자열의 비교
		// equals 는 대소문자까지 비교
		// equalsIgnoreCase 는 대소문자 무시하고 비교
		
		System.out.println("str1.equals(\"Java Programming\")" + str1.equals("java programming"));
		System.out.println("str1.equals(\"Java Programming\")" + str1.equals("Java Programming"));
		
		System.out.println("str1.equalsIgnoreCase(\"Java Programming\")" + str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java Programming\")" + str1.equalsIgnoreCase("Java Programming"));
		
	}
}
