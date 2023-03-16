package api.io;

import java.io.File;

// File 클래스의 API에 대해 살펴보기
// File 과 Directory를 자바에서 제어하기 위해 만들어진 클래스
public class FileTest01 {
	public static void main(String[] args) {
		File f = new File("src/data/test.txt");
		File f2 = new File("src/data");
		System.out.println(f);	// toString 생략 (파일의 path 출력하도록 오버라이딩 되어있음)
		System.out.println("f.canRead() => " + f.canRead());
		System.out.println("f.canWrite() => " + f.canWrite());
		System.out.println("f.getAbsolutePath() => " + f.getAbsolutePath());
		System.out.println("f.getName() => " + f.getName());
		System.out.println("f.getParent() => " + f.getParent());
		System.out.println("f.getPath() => " + f.getPath());
		
		System.out.println("f.isDirectory() => " + f.isDirectory());
		System.out.println("f.isFile() => " + f.isFile());
		System.out.println("f2.isDirectory() => " + f2.isDirectory());
		System.out.println("f2.isFile() => " + f2.isFile());
		
		System.out.println("f.lastModified() => " + f.lastModified());
		System.out.println("f.length() => " + f.length());
		
//		f.setReadOnly(); // 읽기전용으로 만드는 커맨드 
	}

}