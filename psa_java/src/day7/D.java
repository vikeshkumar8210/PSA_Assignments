package day7;
// They are created inside the method and should be used only with created method.

public class D {
	public static void main(String[] args) {
		D d1 = new D ();
		System.out.println(d1); // local reference variable
	}
	public void test() {
		System.out.println(d1);// Error
	}

}
