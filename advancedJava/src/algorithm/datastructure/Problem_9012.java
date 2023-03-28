package algorithm.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_9012 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
			
		for(int i=0; i<test_case; i++) {
			Stack<Character> stk = new Stack<>();
			String line = br.readLine();
			/*for(int j=0; j<line.length(); j++) {
				char c = line.charAt(j);
				*/
			for (char c : line.toCharArray()) {
			
				if(c == '(') {
					stk.push(c);
				}else if(c == ')') {
					if(stk.empty()) {
						stk.push(c);	// VPS 만족 안함. line 31 의 if문 탈출을 위한 push 
						break;
					}
					stk.pop();
				}
				
			}
			if(stk.empty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
