package chap11.exception;
// 예외처리 : try ~ catch ~ finally
// 예외가 발생하거나 발생하지 않거나 반드시 실행해야하는 코드가 필요한 경우 finally 블럭 안에 명시한다.
// 자원반납하기
public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			System.out.println("프로그램시작");
			System.out.println("디비연동");
			System.out.println("디비처리진행중..."+10/0);
			System.out.println("완료..");
			// 예외발생 시 실행되지 않음
			// System.out.println("자원반납");
		}catch(Exception e) {
			System.out.println("오류코드 확인하기");
			// 예외가 발생되지 않으면 실행되지 않음
			// System.out.println("자원반납");
		}finally {
			// 예외가 발생되지 않거나 발생되거나 무조건 실행되는 코드
			System.out.println("무조건 실행되는 코드 ----------------------- 자원반납");
		}
	}
}
