package day10;
// This keyword will automatically point to the current object running in the program.

public class A {
	
	public static void main(String[] args) {
		A a1 = new A ();
		a1.test();
		
		A a2 = new A ();
		a2.test();
		
		a1.test();
	}
	public void test() {
		System.out.println(this);
	}

}
