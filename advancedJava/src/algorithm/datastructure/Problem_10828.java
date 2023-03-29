package algorithm.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyStack{
	int[] stk;
	int idx;
	
	public MyStack() {
		stk = new int [10000];
		idx = 0;
	}
	
	public void push(int data) {
		if(idx >= 10000) {
			return;
		}
		stk[idx] = data;
		idx++;
	}
	
	public int pop() {
		if(idx <= 0) {
			return -1;
		}
		
		idx--;
		int ret = stk[idx];
		stk[idx] = 0;
		return ret;
	}
	
	public int size() {
		return idx;
	}
	
	public int empty() {
		if(idx == 0)
			return 1;
		else
			return 0;
	}
	
	public int top() {
		if(idx == 0) {
			return -1;
		}
		
		return stk[idx-1];
	}
}

public class Problem_10828 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		
		MyStack ms = new MyStack();
		
		for(int i=0; i<time; i++) {
			String line = br.readLine();
			String[] lineArr = line.split(" ");
			
			switch (lineArr[0]) {
			case "push":
				ms.push(Integer.parseInt(lineArr[1]));
				break;
			case "pop":
				System.out.println(ms.pop());
				break;
			case "size":
				System.out.println(ms.size());
				break;
			case "empty":
				System.out.println(ms.empty());
				break;
			case "top":
				System.out.println(ms.top());
				break;
			default:
				break;
			}
		}
	}
}
