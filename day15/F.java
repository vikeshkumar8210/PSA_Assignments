package day15;

public class F extends E {
	@Override
	public void test() {// error
		System.out.println(200);
	}
	public static void main(String[] args) {
		F f1 = new F ();
		f1.test2();
	}

}
