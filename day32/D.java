package day32;

// Improves file writing performance.
// It has newline() method using which we can write content in new line.
import java.io.BufferedWriter;
import java.io.FileWriter;

public class D {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C://files//C.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(500);
			bw.newLine();
			bw.write("vikesh");
			bw.newLine();
			char[] ch= {'m','i'};
			bw.write(ch);
			bw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
