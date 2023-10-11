package day31;

import java.io.FileReader;

// FileReader Class
public class C {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader ("C://files//A.txt");
			for(int i=0; i<159; i++) {
				System.out.print((char) fr.read());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
// OutPut:- length()- It is a non-static method present in file class. The return tpye method is long. It count number of character in a given file including white spaces.
