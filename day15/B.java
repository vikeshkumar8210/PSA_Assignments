package day15;

public class B extends A {
	public void test () {
		System.out.println(500);
	}
	public static void main(String[] args) {
		B b1 = new B ();
		b1.test();
		
		A a1 = new A ();
		a1.test();
	}

}
