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
			sock = new Socket("172.30.1.41", 12345);
			System.out.println("연결되었습니다.");
			
			ClientSenderThread send = new ClientSenderThread(sock);
			ClientReceiverThread recv = new ClientReceiverThread(sock);
			
			Thread sender = new Thread(send, "send");
			Thread receiver = new Thread(recv, "recv");
			
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
