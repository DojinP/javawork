package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class MyNetServerExam02 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		
		BufferedReader in = null;
		PrintWriter out = null;

		Random rand = new Random();
		
		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 대기 중...");
			while(true) {
				client = server.accept();
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);
				
				String greetings = "안녕하세요 클라이언트님";
				out.println(greetings);
				
				int randNum = rand.nextInt(8)+2;
				out.println(randNum);
				
				String msg = in.readLine();
				System.out.println(client.getInetAddress().getHostAddress() + " 클라이언트에게 보낸 숫자는 " + msg + " 입니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
