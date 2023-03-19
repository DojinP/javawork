package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClientExam02 {
	public static void main(String[] args) {
		Socket socket = null;
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			socket = new Socket("172.30.1.41", 12345);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			
			String greetings = in.readLine();
			System.out.println(greetings);
			
			int dan = Integer.parseInt(in.readLine());
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			
			if(dan % 2 == 1) {
				out.println("홀수");
			}else {
				out.println("짝수");
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
