package api.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// File 객체를 이용한 예제
public class FileExam {
	public static void main(String[] args) {
		File file = new File("src/data");
		// file 객체 내부에  있는 파일과 모든 폴더를 출력
		// test ------- [폴더]
		// ....
		// score.txt -------- [파일(15:2023/03/10)]
		// ....					  --- -----------
		//						파일size  마지막으로 수정한 날짜
		// 1. 지정한 File 객체의 내부 정보를 받아올 수 있는 메소드를 찾기
		//	  => Hint : File 클래스의 API에서 결과가 배열이나 자료구조인 메소드를 찾기
		//	  => File API 문서에서 찾아서 작업
		
		File[] list = file.listFiles();
		
//		for(int i=0; i<list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		for(int i=0; i<list.length; i++) {
			String type = "";
//	1		if(list[i].isFile()) {
//				type = "파일";
//			}else {
//				type = "폴더";
//			}
			
//	2		Calendar c = new GregorianCalendar();
//			c.setTimeInMillis(list[i].lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			
//	1		System.out.println(list[i].getName() + " ------ " + "[" + type + "(" + list[i].length() + ":" + sdf.format(c.getTime()) + ")]");
//	2		System.out.println(list[i].getName() + " ------ " + "[" + (list[i].isFile() ? "파일" : "폴더") + "(" + list[i].length() + ":" + sdf.format(c.getTime()) + ")]");
			System.out.println(list[i].getName() + " ------ " + "[" + (list[i].isFile() ? "파일" : "폴더") + "(" + list[i].length() + ":" + sdf.format(list[i].lastModified()) + ")]");
		}
	}
}
