package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 키보드로 입력한 내용을 클라이언트가 보내오면 데이터를 지속적으로 읽어서 클라이언트에게 회신하는 작업
public class EchoServer01 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(12345);
			System.out.println("대기...");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress()+"님이 접속하셨습니다.");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				// 클라이언트가 보내는 데이터를 계속 읽어서 클라이언트로 쏴주는
				String reMsg = ""; // 클라이언트가 보내오는 데이터를 저장할 
				while(true) {
					// 서버 <- 클라이언트
					reMsg = in.readLine();
					if(reMsg == null) {
						break;
					}
					System.out.println("클라이언트>>" + reMsg);
					// 서버 -> 클라이언트
					out.println(reMsg + "^^");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
