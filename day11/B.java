package day11;

public class B {
	B (){
		System.out.println(2500);
	}
	B (int x){
		this ();
		System.out.println(x);
	}
	public static void main(String[] args) {
		B b1 = new B (200);
	}

}
