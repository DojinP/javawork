package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyNetClientExam01 {
	public static void main(String[] args) {
		
		Socket socket = null;
		String msg = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("172.30.1.41", 12345);
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			msg = dis.readUTF();
			System.out.print(msg);
			
			msg = dis.readUTF();
			System.out.print(msg);
			
			int dan = sc.nextInt();
			dos.writeInt(dan);
			
			msg = dis.readUTF();
			System.out.print(msg);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
