package api.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//파일 입출력 작업
//=> FileReader (문자 단위 입력)
public class FileReaderTest {
	public static void main(String[] args) {
		// FileReader 는 File을 액세스하는 API
		FileReader fr = null;
		try {
			// 1. 파일 열기
			fr = new FileReader(new File("src/data/test.txt"));
			int count = 0;
			long start = System.nanoTime();
			// 2. 파일 액세스
			while(true) {
				int data = fr.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
				count++;
			}
			long end = System.nanoTime();
			System.out.println("실행횟수 = " + count + " 실행시간 = " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 문제가 발생했습니다.");
		} finally {
			// 3. 파일 닫기
			try {
				if(fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
