package day8;
// If we write anything after return keyword than that line of code will never run. Hence we will get unreacheable error.

public class D {
	public static void main(String[] args) {
		D d1 = new D ();
		d1.test();
	}
	public void test() {
		return ;
		System.out.println(100);// unreachable error
	}

}
