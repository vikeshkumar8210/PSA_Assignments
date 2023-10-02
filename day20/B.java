package day20;

public class B implements A{
	@Override
	public void test() {
		System.out.println(2500);
	}
	public static void main(String[] args) {
		B b1 = new B ();
		b1.test();
	}
	
	

}
