package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일 입출력 작업
// => FileInputStream (byte 단위 입력)
public class FileInputStreamTest {
	public static void main(String[] args) {
		// FileInputStream은 File을 액세스하는 API
		try {
			// 1. API 생성
			//  => 파일을 자바 프로그램 안에서 사용하기 위해서는 OS와 통신하며 사용할 파일을 먼저 open 해야한다.
			//  => FileInputStream 생성자 내부에서 그러한 작업을 처리
			
			// 1) 파일 경로를 주지 않고 파일명만 입력하는 경우 기본경로에서 찾는다.
			//		기본 경로: 프로젝트 디렉토리
			//		절대 경로: 드라이브부터 모든 경로 표기
//			FileInputStream fis = 
//					new FileInputStream("C:\\javaweb\\work\\javawork\\advancedJava\\src\\data\\test.txt");
			FileInputStream fis = 
					new FileInputStream("C:/javaweb/work/javawork/advancedJava/src/data/test.txt");
//			FileInputStream fis = 
//					new FileInputStream("src/data/test.txt");
			// 2. 파일 액세스
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 문제가 발생했습니다.");
		} finally {
			// 3. 파일 닫기 - 자원 반납
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO: handle exception
//			}
		}
	}
}
