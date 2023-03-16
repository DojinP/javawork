package api.io;

import java.io.FileInputStream;

public class FileInputStreamTest3 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/data/test.txt");
		byte[] arr = new byte[100];
		int count = 0;
		while(true) {
			// 바이트 배열을 매개변수로 전달하면 byte[]의 크기만큼 읽고 byte[]에 저장. read 메소드는 읽은 byte 수를 리턴한다
			int num = fis.read(arr);
			
			if(num == -1) break;
			
			System.out.println("읽은 바이트 수 :" + num);
			
			
			for(int i=0; i<num; i++) {
				System.out.print((char)arr[i]);
			}
			count++;
		}
		System.out.println("실행횟수 : " + count);
		fis.close();
	}
}
