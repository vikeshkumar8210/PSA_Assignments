package day6;
//These variable are created inside class but outside method without static keyword.
// These variable belongs to object.
// Only after creating object we can access non-static variable.
// It is not mandatory to be initialized depending on data type auto-Initialization will take place.

public class A {
	int x;
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
	}

}
// Output will be 0 by auto-initialization