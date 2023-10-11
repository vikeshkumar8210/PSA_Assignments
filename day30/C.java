package day30;
// If file is deleted it will return boolean value true or else it return false.

import java.io.File;

public class C {
	public static void main(String[] args) {
		File f = new File ("C://files//C.txt");
		boolean val = f.delete();
		System.out.println(val);
	}

	
}
// True
