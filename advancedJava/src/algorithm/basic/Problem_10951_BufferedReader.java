package algorithm.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_10951_BufferedReader {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			String[] lineArr = line.split(" ");
			System.out.println(Integer.parseInt(lineArr[0]) + Integer.parseInt(lineArr[1]));
		}
	}
}
