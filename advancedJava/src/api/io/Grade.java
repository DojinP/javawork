package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Grade {

	public static void main(String args[]) {

		Grade grade = new Grade();

		String fileName = "score.txt";
		grade.printGrade(fileName);

	}

	public void printGrade(String fileName) {

		/* 이곳에 프로그램을 완성하십시오. */
		BufferedReader br = null;
		String line = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		int tot = 0;
		int avg = 0;
		
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				map.put(data[0], Integer.parseInt(data[1]));
				System.out.println(data[0] + "의 점수는 " + data[1] + "점 입니다.");
			}
			
			Set<String> keySet = map.keySet();
			
			for (String key : keySet) {
				int score = map.get(key);
				tot += score;
			}
			
			avg = tot / map.size();
			
			System.out.println("모두의 총점은 " + tot + "점 입니다.");
			System.out.println("모두의 평균은 " + avg + "점 입니다.");
			
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