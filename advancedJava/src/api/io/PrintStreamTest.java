package api.io;

import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream("src/data/p_out.txt");
		
		ps.println(3);
		ps.close();
	}

}
