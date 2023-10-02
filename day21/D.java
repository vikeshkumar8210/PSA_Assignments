package day21;

public class D extends C{
	@Override 
	public void test1() {
		System.out.println(789);
	}
	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		System.out.println(d1.x);
		C.test3();
		System.out.println(C.y);
	}

}
