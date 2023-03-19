package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient02 {
	public static void main(String[] args) {
		Socket socket = null;
		
		InputStream is = null;			// 서버가 보내오는 데이터를 읽기 위한 스트림 객체
		DataInputStream dis = null; 	// 서버가 보내오는 데이터를 읽기 위한 보조 스트림
		
		OutputStream os = null;			// 서버에 보낼 데이터를 출력하기 위한 스트림 객체
		DataOutputStream dos = null;	// 서버에 보낼 데이터를 출력하기 위한 보조 스트림
		
		try {
			// 1. 서버에 접속하기 위한 소켓 객체를 생성하기			
			socket = new Socket("172.30.1.41", 12345);
			// 2. 서버가 보내오는 데이터를 읽기 위한 스트림 생성 
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			// 3. 서버에 보낼 데이터를 출력하기 위한 스트림 생성			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			// 4. Client <- Server (서버가 보내오는 데이터 읽기)
			//   4-1) Client <- Server (서버가 보내오는 데이터 2회 읽기)
			String msg = dis.readUTF();
			System.out.println("서버가 전송한 데이터 1 : " + msg);
			int intMsg = dis.readInt();
			System.out.println("서버가 전송한 데이터 2 : " + intMsg);
			
			dos.writeUTF("Hi");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
