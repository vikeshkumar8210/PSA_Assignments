package day2;

public class A {
	static int y = 20;// static variable
	int x= 10;// non-statics variable
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(A.y);
		
	}
	

}
