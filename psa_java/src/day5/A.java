package day5;

public class A {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		
	}
	// These variables are created inside the method & should be used only within created method.
	public void test() {
		System.out.println(x);// Error
	}

}
