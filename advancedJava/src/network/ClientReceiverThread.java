package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiverThread implements Runnable {

	Socket sock;
	
	ClientReceiverThread(Socket sock){
		this.sock = sock;
	}
	
	@Override
	public void run() {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String recvMsg = null;
			
			while((recvMsg = in.readLine()) != null) {
				System.out.println("서버>>" + recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
