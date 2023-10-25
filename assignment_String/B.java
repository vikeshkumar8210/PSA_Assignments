package assignment_String;

public class B {
	public static void main(String[] args) {
		String str = " Pankaj Sir Academy ";
		String[] s=str.trim().split(" ");
		System.out.println(s.length);
		
		for (String x:s) {
			System.out.print(x);
		}
	}

}
