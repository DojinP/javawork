package api.lang;
// String 객체는 원본이 변경되지 않고 String메소드 호출의 결과(String 객체의 복제본)가 String 객체로 만들어져서 리턴된다.
// StringBuffer 는 원본이 변경된다. 쓰레드 처리 - ㅇ
// StringBuilder 는 StringBuffer와 API 동일하므로 원본이 변경된다. 그러나 쓰레드 처리 - x0
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		StringBuilder sbu = new StringBuilder("java programming");
		
		System.out.println("sb원본:"+sb);
		System.out.println("sbu원본:"+sbu);
		
		// append : 문자열 뒤에 추가하기
		sb.append("재밌다.");
		sbu.append("재밌다.");
		
		System.out.println("추가후 sb원본:"+sb);
		System.out.println("추가후 sbu원본:"+sbu);
		
		// insert : 문자열 중간에 삽입하기
		sb.insert(2, "servlet");
		sbu.insert(5, "jsp");
		
		System.out.println("삽입후 sb원본:"+sb);
		System.out.println("삽입후 sbu원본:"+sbu);
		
		// delete : 문자열 삭제 // start(inclusive) ~ end(exclusive)
		sb.delete(2,  5);
		sbu.delete(4,  8);
		
		System.out.println("삭제후 sb원본:"+sb);
		System.out.println("삭제후 sbu원본:"+sbu);
		
		// 문자열 뒤집기
		sb.reverse();
		sbu.reverse();

		System.out.println("뒤집은후 sb원본:"+sb);
		System.out.println("뒤집은후 sbu원본:"+sbu);
	}
}
