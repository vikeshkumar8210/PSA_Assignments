package day3;

public class A {
	int x = 20;
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
	}
	public void test() {// non-statics object.
		System.out.println(100);
	}

}
