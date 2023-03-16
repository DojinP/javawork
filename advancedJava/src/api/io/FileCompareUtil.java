package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {

	public static void main(String[] args) {
		
		FileCompareUtil fcu = new FileCompareUtil();
		
		String fName1 = "src/data/fstFile1.txt";
		String fName2 = "src/data/scdFile1.txt";
		
		List<String> result = null;
		
		try {
			result = fcu.compareFile(fName1, fName2);
			for (String string : result) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		List<String> list = new ArrayList<String>();
		
		BufferedReader br1 = new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));
		String str1 = "";
		String str2 = "";
		int index = 1;
		while((str1 = br1.readLine()) != null & (str2 = br2.readLine()) != null) {	// 두 파일 라인이 같다고 가정
			if(str1.equals(str2)) {
				index++;
				continue;
			}else {
				list.add("LINE " + index + ":" + str2);
				index++;
			}
		}
		
		br1.close();
		br2.close();
		
		return (ArrayList)list;
	}
}
