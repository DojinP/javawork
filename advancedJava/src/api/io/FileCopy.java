package api.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		// src/data/InputStreamTest.java 파일을 잃어서 파일을 copy하는 프로그램을 작성하세요
		// 1. 출력파일명 : output.txt
		// 2. 예외처리를 모두 적용하세요
		// 3. 제출
		// ++힌트
		// FileReaderTest와 FileWriterTest를 참고
		// 읽으면서 바로 파일로 출력
		// FileReader와 FileWriter 같이 사용
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(new File("src/data/InputStreamTest.java"));
			fw = new FileWriter("src/data/output.txt", true);
			int data = 0;
			while((data=fr.read())!=-1) {
				fw.write(data);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) {
					fr.close();
				}
				if(fw!=null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
