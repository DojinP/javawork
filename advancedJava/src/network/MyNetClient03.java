package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyNetClient03 {
	public static void main(String[] args) {
		Socket socket = null;
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			socket = new Socket("172.30.1.41", 12345);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// autoflush속성을 true로 설정하면 println 메소드가 호출될 때 자동으로 flush 메소드를 호출한다.
			out = new PrintWriter(socket.getOutputStream());
			// ==================== 통신 시작 ===================
			
			// 서버 -> 클라이언트
			String msg1 = in.readLine();
			String msg2 = in.readLine();
			System.out.println(msg1);
			System.out.println(msg2);
			
			// 클라이언트 -> 서버
			out.println("7");
			out.flush();
			
			String msg3 = in.readLine();
			System.out.println(msg3);
			
			for(int i=1; i<=9; i++) {
				String msg4 = in.readLine();
				System.out.println(msg4);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
