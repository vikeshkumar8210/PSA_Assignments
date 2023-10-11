package day30;
// If the file is found it will print "true" or else it will print "false"
import java.io.File;

public class B {
	public static void main(String[] args) {
		File f = new File ("C://files//A.txt");
		boolean val = f.exists();
		System.out.println(val);
	}

}
// True
