package day31;
// It count number of character in a given file including white spaces.
import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File ("C://files//A.txt");
		long val = f.length();
		System.out.println(val);
	}

}

// OutPut:- 159


