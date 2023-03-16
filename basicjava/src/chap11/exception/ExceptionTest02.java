package chap11.exception;
// 자바에서 예외를 처리하는 방법 : try ~ catch 블럭
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			// 예외발생 가능성이 있는 코드
			System.out.println("try 블럭 시작");
			// Exception이 발생하면 발생시점 이후의 try 내부 코드는 실행되지 않는다(catch 블럭으로 이동).
			System.out.println(10/0);
			System.out.println("try 블럭 종료");
		}catch(ArithmeticException e){
			// 예외가 발생하면 처리할 문장
			// Exception이 발생하지 않으면 catch 블럭은 실행되지 않는다.
			System.out.println("예외발생");
			System.out.println("예외메시지 => " + e.getMessage());
			// 예외를 추적해서 화면에 line num까지 출력하므로 개발 시 많이 활용됨
			e.printStackTrace();
		}
	}
}
