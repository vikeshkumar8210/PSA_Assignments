package day5;

public class E {
	static int x =50;
	public static void main(String[] args) {
		System.out.println(E.x);// Correct
		E.test();
		
	}
	public static void test() {// Static
		System.out.println(E.x);// Correct
	}
	
	
	

}
