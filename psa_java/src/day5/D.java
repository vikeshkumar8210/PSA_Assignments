package day5;
// Static Variables
// These variables has global access
// these variables are created inside class outside method using static keyword.
// They belongs to class
public class D {
	static int x = 10;// Global Variable
	public static void main(String[] args) {
		int y = 30;
		System.out.println(D.x);// Correct
		System.out.println(y); //correct
		D.test();
	}
	public static void test () {
		System.out.println(D.x);// Correct
		System.out.println(y);// Error
	}

}
