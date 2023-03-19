package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트용 프로그램
public class MyNetClient01 {
	public static void main(String[] args) {
		try {
			// 서버와 통신할 수 있는 클라이언트 소켓 객체를 생성
			// ip와 port 정보를 입력 => 서버의 ip, 서버에서 열어놓은 port
			// Socket 객체를 만들면 매개변수로 전달한 IP 주소로 접속한다.
			// => 생성자 메소드에서 해당 IP와 Port 정보를 이용해서 서버에 접속하는 작업을 처리
//			Socket socket = new Socket("localhost", 50000);
			Socket socket = new Socket("172.30.1.41", 50000);
			System.out.println("서버 접속 완료");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
