package api.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy_Buffer {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			br = new BufferedReader(new FileReader("src/data/InputStreamTest.java"));
			fw = new FileWriter("src/data/output2.txt");
			String data = "";
			while((data=br.readLine())!=null) {
				fw.write(data + "\n");
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
