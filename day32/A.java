package day32;

import java.io.FileWriter;

public class A {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c://files//B.txt",true);
			fw.write("100");
			
			fw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
