package api.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//java.util.StringTokenizer st = new java.util.StringTokenizer("");	// 이런식으로 사용하지않음
		String str = "java,mysql,html,css,javascript,jquery";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
		System.out.println("=====================");
		while(st.hasMoreTokens()) {
			String token= st.nextToken();
			System.out.println(token);
		}
	}
}
