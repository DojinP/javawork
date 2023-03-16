package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress - 자바에서 IP 주소를 모델링해놓은 객체
// 				 로컬과 도메인을 통해서 IP주소를 가져올 수 있도록 지원하는 API 
public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("ia.getHostName() => " + ia.getHostName());
			System.out.println("ia.getHostAddress() => " + ia.getHostAddress());
			System.out.println("ia.getLocalHost() => " + ia.getLocalHost());
			System.out.println("================================================================");
			InetAddress[] iaArr = InetAddress.getAllByName(args[0]);
			for (int i = 0; i < iaArr.length; i++) {
				System.out.println("iaArr["+i+"].getHostName() => " + iaArr[i].getHostName());
				System.out.println("iaArr["+i+"].getHostAddress() => " + iaArr[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
}
