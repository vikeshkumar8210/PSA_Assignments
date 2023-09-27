package day8;
// we can use this only inside not a void method
// It is mandatory to be used not void method
// It will return value & control both to method calling statement.

public class E {
	public static void main(String[] args) {
		E e1 = new E ();
		int x = e1.test();
		System.out.println(x);
	}
	public int test () {
		return 5;
	}

}
