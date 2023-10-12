package day32;

import java.io.FileWriter;

public class B {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C://files//b.txt");
			fw.write(97);
			fw.write("abcd");
			char[] ch= {'m','k'};
			fw.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
