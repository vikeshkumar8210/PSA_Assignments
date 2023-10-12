package day32;

import java.io.FileReader;
import java.io.BufferedReader;
public class C {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C://files//B.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0; i<4; i++) {
				System.out.println(br.readLine());
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
