package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer02 {
	public static void main(String[] args) {
		Socket clientSocket = null;
		InputStream is = null;			// 클라이언트의 데이터를 읽기 위한 스트림 객체
		DataInputStream dis = null; 	// 클라이언트가 보내는 데이터를 읽기 위한 보조 스트림
		
		OutputStream os = null;			// 클라이언트에 보낼 데이터를 출력하기 위한 스트림 객체
		DataOutputStream dos = null;	// 클라이언트에 보낼 데이터를 출력하기 위한 보조 스트림
		// 1. ServerSocket 생성, Port 오픈
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트 접속 대기...");
			while(true) {
				// 2. 클라이언트가 접속하면 접속한 클라이언트와 통신할 수 있는 소켓 객체 생성
				clientSocket = server.accept();
				String ip = clientSocket.getInetAddress().getHostAddress();
				System.out.println(ip + " 님이 접속");
				// 3. 클라이언트와 통신할 수 있도록 스트림객체를 생성
				//	3-1) 클라이언트가 전송하는 데이터를 읽기 위한 스트림 객체를 소켓 객체를 통해 생성
				is = clientSocket.getInputStream();
				dis = new DataInputStream(is);
				//	3-2) 클라이언트에게 전송할 데이터를 보내기 위한 스트림 객체를 소켓 객체를 통해 생성
				os = clientSocket.getOutputStream();
				dos = new DataOutputStream(os);
				
				// 4. Server -> Client (순서 중요!)
				//    output 2번
				dos.writeUTF(ip + "님 접속을 환영합니다.");
				dos.writeInt(20000);
				
				String msg = dis.readUTF();
				System.out.println(ip + "님이 보낸 메시지 : " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
