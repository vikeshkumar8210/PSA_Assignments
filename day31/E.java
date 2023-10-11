package day31;
// FileReader

import java.io.File;
import java.io.FileReader;

public class E {
	public static void main(String[] args) {
		try {
			File f = new File ("C://files//A.txt");
			FileReader fr = new FileReader (f);
			char[] ch = new char[(int)f.length()];
			fr.read(ch);
			for(char c:ch) {
				System.out.print(c);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// OutPut:- length()- It is a non-static method present in file class. The return tpye method is long. It count number of character in a given file including white spaces.
