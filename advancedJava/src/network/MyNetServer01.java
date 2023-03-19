package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 서버용 프로그램
// -> 서버는 클라이언트가 언제라도 접속이 가능하도록 포트를 열고 무한히 대기해야한다.
//												   -----
//												 무한 루프 처리
public class MyNetServer01 {
	public static void main(String[] args) {
		try {
			// 클라이언트와 통신할 수 있도록 준비하기
			// -> 클라이언트와 통신할 수 있도록 ServerSocket 생성하고
			ServerSocket server = new ServerSocket(50000);
			System.out.println("서버 준비 완료... 클라이언트 접속대기중...");
			// 2. 클라이언트가 접속하면 클라이언트 정보를 가져와서 작업해야 한다.
			// 		=> 대기하다가 클라이언트가 접속하면 클라이언트 정보를 객체로 만들어서 리턴
			//									------------
			//									소켓으로 만들어져서 리턴된다.
			while (true) {
				// 클라이언트의 접속을 대기하면서 클라이언트가 접속하면
				// 클라이언트와 통신할 수 있도록 input/output 모두 쓰레드가 생성
				Socket client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				System.out.println("접속한 클라이언트 => " + clientIp.getHostAddress());
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
