package chap05;

import java.util.Random;

public class ArgsExam01 {
	public static void main(String[] args) {
		if(args[0].equals("int")) {
			
			int[] iarr = new int[5];
			Random rand = new Random();
			for(int i=0; i<iarr.length; i++) {
				iarr[i] = rand.nextInt(10)+1;
				System.out.print(iarr[i] + "\t");
			}
			System.out.println();
			
		}else if (args[0].equals("String")) {
			String[] sarr = new String[3];
			
			for(int i=0; i<sarr.length; i++) {
				sarr[i] = "java";
				System.out.println("sarr["+i+"] = " + sarr[i]);
			}
		}
	}
}
