package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 과제 : 서버 - 클라이언트 1:1 통신 구현하기
public class EchoClient03 {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null; // 서버로부터 전송된 데이터를 읽기위한 스트림
		PrintWriter out = null; 	// 서버로 전송할 데이터를 쓰기위한 스트림
		BufferedReader keyin = null; // 키보드로 입력한 데이터를 읽기위한 스트림
		
		try {
			socket = new Socket("172.30.1.41", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			// 키보드에 입력한 내용이 지속적으로 서버에 전달되도록 구현
			String sendMsg = "";	// 서버에 보낼 메시지
			String reMsg = "";		// 서버에서 받을 메시지
			while((sendMsg=keyin.readLine())!=null) {
				// 클라이언트 -> 서버
				out.println(sendMsg);
				System.out.println("클라이언트>>" + sendMsg);
				// 클라이언트 <- 서버
				reMsg = in.readLine();
				System.out.println("서버>>" + reMsg);					
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}