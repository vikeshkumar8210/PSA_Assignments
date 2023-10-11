package day31;

import java.io.File;
import java.io.FileReader;

public class D {
	public static void main(String[] args) {
		try {
			File f = new File ("C://files//A.txt");
			FileReader fr = new FileReader (f);
			for (int i=0; i<f.length(); i++) {
				System.out.print((char)fr.read());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
// OutPut:- length()- It is a non-static method present in file class. The return tpye method is long. It count number of character in a given file including white spaces.
