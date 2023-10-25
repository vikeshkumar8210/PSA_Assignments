package assignment_String;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the opening and closing parathesis ");
		String str= scan.next();
		int count1 =0;
		int count2 =0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==')') {
				count1++;
			}
			else if (str.charAt(i)=='(') {
				count2++;
			}
			if (count1==count2) {
				System.out.println("No Error");
			}
			else {
				System.out.println("Error");
			}
		}
	}

}
