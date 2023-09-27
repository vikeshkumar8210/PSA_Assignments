package day9;
// we cannot use this keyword inside static members.
public class F {
	int x =10;
	public static void main(String[] args) {
		F f1 = new F();
		System.out.println(this);//error
		f1.test();
		
	}
	public void test() {
		System.out.println(this);//error
	}

}
