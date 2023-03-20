package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SingleChatClient {

	public static void main(String[] args) {
		Socket sock = null;

		try {
			// 초기화
			// Socket 객체를 생성하면 바로 서버에 접속된다.
			// 서버 측에서는 accept 메소드가 실행된다.
			sock = new Socket("172.30.1.41", 12345);
			System.out.println("연결되었습니다.");
			
			// 서버와 통신할 쓰레드 객체를 생성해서 start 하기
//			ClientSenderThread send = new ClientSenderThread(sock);
//			ClientReceiverThread recv = new ClientReceiverThread(sock);
			
//			Thread sender = new Thread(send, "send");
//			Thread receiver = new Thread(recv, "recv");
			
//			sender.start();
//			receiver.start();
			
			new Thread(new ClientSenderThread(sock)).start();
			new Thread(new ClientReceiverThread(sock)).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
