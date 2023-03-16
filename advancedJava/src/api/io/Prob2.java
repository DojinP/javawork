package api.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2 {

	public static void main(String[] args) {
		Prob2 p2 = new Prob2();
		p2.printScore("src/data/data2.txt");
	}

	public void printScore(String fileName) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String[] title = br.readLine().split("/");
			// 타이틀 출력
			for (String data : title) {
				System.out.print(data + "\t");
			}
			System.out.println("총점");

			String recordLine = "";

			while ((recordLine = br.readLine()) != null) {
				int tot = 0;
				String[] record = recordLine.split("/");
				int index = 0;
				for (String data : record) {
					System.out.print(data + "\t");
					if (index > 0) {
						tot += Integer.parseInt(data);
					}
					index++;
				}
				System.out.println(tot);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
