package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSenderThread extends Thread {
	
	Socket sock;
	
	public ServerSenderThread(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		PrintWriter out = null;		
		BufferedReader keyin = null;
		try {
			out = new PrintWriter(sock.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = null;
			
			while((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg);
				System.out.println("서버>>" + sendMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
