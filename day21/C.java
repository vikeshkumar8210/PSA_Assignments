package day21;
// In abstract class we can create both static and non-static member in it.
// Abstract class object cannot be created.
// Abstract class does not support multiple-Inheritance.
abstract public class C {
	int x = 10;
	static int y =20;
	abstract public void test1();
	public void test2() {
		System.out.println(256);
	}
	public static void test3 () {
		System.out.println(423);
	}

}
