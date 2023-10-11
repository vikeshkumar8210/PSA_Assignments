package day30;
// If the file is created it will return boolean value true or else it will return false. It will not replace existing file
// Note:- If unable to create a file. It will not replace existing file.

import java.io.File;
import java.io.IOException;

public class D {
	public static void main(String[] args) {
		File f = new File("C://files//C.txt");
		boolean val;
		try {
			val = f.createNewFile();
			System.out.println(val);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// OutPut:- True
