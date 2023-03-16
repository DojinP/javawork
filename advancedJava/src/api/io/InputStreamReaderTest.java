package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

// byte 단위로 입력을 하기 위한 모든 클래스의 최상위클래스인 InputStream
// 키보드로 입력한 문자를 읽어서 리턴
public class InputStreamReaderTest {
	public static void main(String[] args) {
		// 1. 사용할 API 생성
		//    => 입력할 데이터 소스와 연결
//		InputStreamReader ir = new InputStreamReader(System.in); // 키보드 입력을 표현하는 상수를 변수에 저장
		InputStreamReader ir = null;
		try {
			ir = new InputStreamReader(System.in);
			while (true) {
				// 2. 데이터 읽기
				//    => 모든 데이터를 읽기 위해서 반복 작업
				int data = ir.read();
				if (data == 13) {
					break;
				}
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 3. 사용하던 자원을 해제(자원반납)
			try {
				// ir에 대한 null 체크 - null 인 상태에서 close 호출 시 NullPointerException이 발생하므로
				if(ir!=null) ir.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
}
