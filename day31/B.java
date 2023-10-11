package day31;
// The return type of this method is string array. This return all the files names in the given path.

import java.io.File;

public class B {
	public static void main(String[] args) {
		File f = new File ("C://files//");
		String[] names = f.list();
		for (String name: names) {
			System.out.println(name);
		}
		System.out.println(names.length);
		
	}

}
// A.txt
// B.txt
// C.txt
// p1
// 4

