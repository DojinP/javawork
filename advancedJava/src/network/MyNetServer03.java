package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

public class MyNetServer03 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(12345);
			System.out.println("접속 대기중...");
			while(true) {
				socket = server.accept();
				InetAddress client_info = socket.getInetAddress();
				System.out.println(client_info.getHostAddress() + "님 접속");
				
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
				// ==================== 통신 시작 ===================
				/*
				 * PrintWriter는 출력버퍼에 임시로 보관되어 스트림으로 출력될 떄까지 대기중인 데이터를
				 * 스트림으로 내보내는 작업을 해야한다.
				 * flush()를 호출해서 버퍼를 비우는 작업을 처리해야한다.
				 *  ㄴ> 출력버퍼를 비우면서 실제 데이터를 출력
				 */
				// 1. 서버 -> 클라이언트
				out.println("안녕, 환영합니다. " + client_info.getHostAddress() + "님");
				out.println("출력할 단 : ");
				out.flush();
				
				// 2. 클라이언트 -> 서버
				int dan = Integer.parseInt(in.readLine());
				out.println("클라이언트가 입력한 단은 " + dan + "단 입니다.");
//				out.flush();
				System.out.println("클라이언트가 입력한 단은 " + dan + "단 입니다.");
				for (int i=1; i<=9 ; i++) {
					System.out.println(dan+"*"+i+"="+(dan*i));
					out.println(dan+"*"+i+"="+(dan*i));
				}
				out.flush();	
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
