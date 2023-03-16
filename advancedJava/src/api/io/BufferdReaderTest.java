package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// BufferedReader 와 같은 보조스트림은 실제 데이터소스(파일, 키보드입력(System.in), 네트워크입력...)와 직접 연결이 불가능
// -> 실제 데이터 소스와 연결되는 스트림 객체를 생성한 후에 보조 스트림 객체를 만들어야한다.
public class BufferdReaderTest {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 BufferdReader로 읽기
//		FileReader fr = new FileReader("src/data/test.txt");
//		BufferedReader br = new BufferedReader(fr);
		
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br2 = new BufferedReader(isr);
		// 버퍼라는 임시 저장소를 이용해서 입력처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new FileReader("src/data/test.txt"));
		
		
		int count = 0;
		long start = System.nanoTime();

		while(true) {
			String line = br2.readLine();
			if(line==null) {
				break;
			}
			System.out.println(line);
			count++;
		}
		long end = System.nanoTime();

		System.out.println("실행횟수 : " + count + " 실행시간 = " + (end - start));
	}

}
