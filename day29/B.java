package day29;
// Find the given number is prime or not prime.
public class B {
	public static void main(String[] args) {
		int num =14;
		int count =0;
		
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("It's a prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
