package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient02 {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			socket = new Socket("172.30.1.41", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String msg = in.readLine();
			System.out.println(msg);
			
			while(true) {
				System.out.print("서버에 보낼 명령어를 입력하세요: ");
				String sendMsg = keyin.readLine();
				out.println(sendMsg);
				
				String reply = in.readLine();
				System.out.println(reply);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
