package day11;
// While calling constructor this keyword should always be first statement.

public class A {
	A (){
		System.out.println(500);
	}
	A (int x){
		System.out.println(x);
		this (); //Error
	}
	public static void main(String[] args) {
		A a1 = new A (50);
	}

}
