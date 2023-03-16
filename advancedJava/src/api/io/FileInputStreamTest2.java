package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 1. 파일 열기
			fis = new FileInputStream("src/data/test.txt");
			int count = 0;
			// 2. 파일 액세스
			while(true) {
				int data = fis.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
				count++;
			}
			System.out.println("실행횟수 : " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 문제가 발생했습니다.");
		} finally {
			// 3. 파일 닫기
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
