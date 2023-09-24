package day7;
// These variable has global access and are created outside method but inside class.

public class B {
	static B b1 = new B();
	public static void main(String[] args) {
		 
		System.out.println(b1);
		b1.test();
	}
	public void test() {
		System.out.println(b1);
	}

}
