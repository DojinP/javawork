package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket sock = null;

		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 대기중...");
			
			while (true) {
				sock = server.accept();
				System.out.println(sock.getInetAddress().getHostAddress() + " 호스트가 접속하였습니다.");
				// 클라이언트와 통신하기 위한 쓰레드 두 개를 생성해서 start
				//					  ---------
				//						ㄴ> input/output에 대한 처리
				
				ServerSenderThread send = new ServerSenderThread(sock);
				ServerReceiverThread recv = new ServerReceiverThread(sock);
				
				send.start();
				recv.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
