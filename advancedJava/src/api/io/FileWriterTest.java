package api.io;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter
// FileWriter는 문자 단위로 출력
public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		// 파일 출력의 기본은 덮어쓰기
		// 1. 파일 열기
		//  => 파일이 존재하지 않으면 생성한다.
//		FileWriter fw = new FileWriter("src/data/result.txt");			// 덮어쓰기
		FileWriter fw = new FileWriter("src/data/result.txt", true);	// append 모드를 true로 추가
		// 2. 파일 액세스
		fw.write(97);
		fw.write(98);
		fw.write("안녕하세요\n");
		fw.write("반갑습니다\n");
		
		// 3. 파일 닫기
		fw.close();
	}

}
