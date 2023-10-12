package day32;
//IT will create a new file every time we run the code and also it replaces by default earlier file.
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
