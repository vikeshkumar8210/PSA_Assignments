package day26;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		String cnd ="yes";
		Scanner scan = new Scanner(System.in);
		
		while(cnd.equals("yes")) {
			System.out.println("Enter the amount");
			int amount = scan.nextInt();
			
			System.out.println("please collect RS."+amount);
			System.out.println("DO you want to continue(yes/no)");
			cnd = scan.next();
		}
	}

}
