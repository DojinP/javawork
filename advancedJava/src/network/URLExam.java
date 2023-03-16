package network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExam {
	public static void main(String[] args) {
		// 웹상에서 검색할 수 있는 이미지 리소스에 접속하고 파일로 저장하기
		// => 이미지 다운로드
		// images 패키지(디렉토리) 생성 후 myImg.jpg로 저장하기
		String target = "http://cdn.kormedi.com/wp-content/uploads/2021/07/0002313329_001_202105200942055171-580x387.jpg";
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			URL url = new URL(target);
			
			bis = new BufferedInputStream(url.openStream());
			bos = new BufferedOutputStream(new FileOutputStream("src/images/myImg.jpg"));
			
			while(true) {
				int data = bis.read();
				if(data == -1) {
					break;
				}
				bos.write(data);
			}
			bos.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
//				if(bis!=null) bis.close();
				if(bos!=null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
