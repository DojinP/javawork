package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//과제 : 서버 - 클라이언트 1:1 통신 구현하기
public class EchoServer03 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null; // 키보드로 입력한 데이터를 읽기위한 스트림

		try {
			server = new ServerSocket(12345);
			System.out.println("대기...");
			while (true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress() + "님이 접속하셨습니다.");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				// 클라이언트가 보내는 데이터를 계속 읽어서 클라이언트로 쏴주는
				String sendMsg = ""; // 클라이언트로 보낼 메시지를 저장할 변수
				String reMsg = ""; // 클라이언트가 보내오는 메시지를 저장할 변수
				while (true) {
					// 서버 <- 클라이언트
					reMsg = in.readLine();
					if(reMsg==null) {
						break;
					}
					System.out.println("클라이언트>>" + reMsg);
					// 서버 -> 클라이언트
					sendMsg = keyin.readLine();
					out.println(sendMsg);
					System.out.println("서버>>" + sendMsg);	

				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
