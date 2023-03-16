package api.lang;

import java.util.Iterator;

public class SystemTest {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaVersion = System.getProperty("java.version");
		String javaVendor = System.getProperty("java.vendor");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println(javaVersion);
		System.out.println(javaVendor);
		
		// 프로그램의 실행시간 체크 - 1970/1/1 기준
		Long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("java");
		}
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println("시작 : " + startTime);
		System.out.println("종료 : " + endTime);
		System.out.println("걸린시간 : " + (endTime - startTime));
		
		// 나노세컨드 - JVM이 인식하는 현재 시간의 값을 나노세컨드로 반환
		// 1/1000000000 (10억분의 1)
		long start = System.nanoTime();
		for(int i=0; i<10; i++) {
			System.out.println("java");
		}
		long end = System.nanoTime();
		
		System.out.println("시작 : " + start);
		System.out.println("종료 : " + end);
		System.out.println("걸린시간 : " + (end- start));
	}
}

