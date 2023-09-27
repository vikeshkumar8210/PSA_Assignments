package day9;
// This keyword is automatically created to store object's address in it.

public class D {
	public static void main(String[] args) {
		D d1 = new D ();
		System.out.println(d1);
		d1.test();
	}
	public void test () {
		System.out.println(this);
	}

}
