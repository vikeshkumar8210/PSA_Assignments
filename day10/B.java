package day10;
// This keyword can access static members but that is not correct way of access static members and should be avoided.

public class B {
	static int x = 10;
	public static void main(String[] args) {
		B b1 = new B ();
		System.out.println(b1.x);//B.x
		b1.test();
		
	}
	public void test() {
		System.out.println(this.x);// B.x
	}

}
