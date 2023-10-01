package day16;
// Here we develop multiple methods with same name in same provided they have different number of arguments or different type of arguments.

public class A {
	public void test () {
		System.out.println(1);
		
	}
	public void test (int x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		A a1 = new A ();
		a1.test();
		a1.test(20);
	}

}
