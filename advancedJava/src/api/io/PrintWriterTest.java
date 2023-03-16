package api.io;
// BufferedReader로 읽고 PrintWriter로 출력하기
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter fw = null;
		try {
			br = new BufferedReader(new FileReader("src/data/InputStreamTest.java"));
			fw = new PrintWriter("src/data/output2.txt");
			String line = "";
			while((line=br.readLine())!=null) {
				fw.println(line);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) {
					br.close();
				}
				if(fw!=null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
