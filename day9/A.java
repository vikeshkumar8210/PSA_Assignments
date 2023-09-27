package day9;
// Constructors should have same name as that of class.
// when ever object is created constructor will be called.
public class A {
	A (){
		System.out.println("A");
		
	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A ();
	}

}
