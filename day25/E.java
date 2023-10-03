package day25;
import java.util.Scanner;
public class E {
	public static void main(String[] args) {
		// To give user INputs
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name = scan.next();//vikesh
		System.out.println("The output is :"+name);
		
		System.out.println("Enter the age:");
		int age = scan.nextInt();//23
		System.out.println("The output is:"+age);
		
		System.out.println("Enter the weight:");
		float weight = scan.nextFloat();//66.5
		System.out.println("The output is:"+weight);
		
		System.out.println("Enter the Answer:");
		boolean ans = scan.nextBoolean();//false
		System.out.println("The output is:"+ans);
		
		
	}

}
