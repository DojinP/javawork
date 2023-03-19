package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServerExam01 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		String ip = null;
		String msg = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 접속 대기...");
			while(true) {
				client = server.accept();
				
				ip = client.getInetAddress().getHostAddress();
				
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				dos.writeUTF("안녕. 환영합니다. " + ip + " 님\n");
				dos.writeUTF("출력할 단 : ");
				int dan = dis.readInt();
				
				msg = "클라이언트가 입력한 단은 " + dan + "단 입니다.\n";
				for(int i=1; i<=9; i++) {
					msg += dan + " * " + i + " = " + (dan * i) + "\n"; 
				}
				
				dos.writeUTF(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
