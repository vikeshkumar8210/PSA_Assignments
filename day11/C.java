package day11;
// when you call one constructor from another constructor it is called as constructor chaining.

public class C {
	C (){
		System.out.println(2000);
	}
	C (int x ){
		this ();
	}
	public static void main(String[] args) {
		C c1 = new C (200);
	}
// output 2000
}
