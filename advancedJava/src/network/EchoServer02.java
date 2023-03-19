package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EchoServer02 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Calendar time = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			server = new ServerSocket(12345);
			System.out.println("클라이언트 대기 중...");
			
			while(true) {
				socket = server.accept();
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				
				out.println("안녕하세요 클라이언트님?");
				
				String reMsg = "";
				while((reMsg = in.readLine())!=null) {
					if(reMsg.equals("안녕하세요?") || reMsg.equals("하이")) {
						out.println(socket.getInetAddress().getHostAddress() + "님 반가워요.");
					}else if(reMsg.equals("오늘 날짜는")) {
						time = new GregorianCalendar();
						String timeStr = format.format(time.getTime());
						out.println("오늘은 " + timeStr + "입니다.");
					}else {
						out.println(socket.getInetAddress().getHostAddress() + "님 어여 가~~");
					}
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
