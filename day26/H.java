package day26;

public class H {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.println("Hello");
			
			k: for (int j=0; j<5; j++) {
				System.out.println("Welcome");
				break k;
			}
		}
	}

}
