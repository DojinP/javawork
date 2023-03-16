package basic;
//변수에 대한 기본사항 확인하기
public class VarTest
{
	public static void main(String[] args){
		int num = 100;
		// 데이터타입을 정의하고 변수를 선언하는 경우는 무조건 새로 만들겠다는 의미
		// 이미 정의된 num 이라는 이름의 변수가 있는데 다시 선언하게 되면 오류 발생
		System.out.println(num);
	}
}