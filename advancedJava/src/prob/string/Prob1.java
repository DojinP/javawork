package prob.string;

public class Prob1 {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);

	}
	public static String myReplace(String str, char oldChar, char newChar){
		// 이 부분을 구현하시오.	
		// 문자 하나씩 추출해서 oldChar와 비교
		// 문자를 하나씩 추출한 것을 다시 합쳐서 문자열로 만들기
		// - oldChar와 일치하면 newChar로 변경
		// - oldChar와 불일치하면 원본문자로 연결
		if(str.indexOf(oldChar) == -1) {
			return str;
		}
		
		String ret = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == oldChar) {
				ret += newChar;
			}else {
				ret += str.charAt(i);
			}
		}
		
		return ret;
	}
	
}