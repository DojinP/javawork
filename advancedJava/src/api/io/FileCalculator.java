package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCalculator {

	public static void main(String[] args) {
		String fName = "src/data/data.txt";
		
		FileCalculator fc = new FileCalculator();
		
		try {
			fc.addCalculateResult(fName);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
//		PrintWriter pw = new PrintWriter(inputFileName);	// 실행되면 data 초기화
		String s = "";
		int plusRes = 0;
		int multiRes = 1;
		
		List<Integer> list = new ArrayList<>();
		
		while((s = br.readLine()) != null) {
			int val = Integer.parseInt(s);
			list.add(val);
			plusRes += val;
			multiRes *= val;
		}
		
		PrintWriter pw = new PrintWriter(inputFileName);
		
		for (Integer data : list) {
			pw.println(data);
		}
		
		pw.println(plusRes);
		pw.print(multiRes);
		
		br.close();
		pw.close();
		
	}
}