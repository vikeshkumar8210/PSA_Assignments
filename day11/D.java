package day11;

public class D {
	D (){
		System.out.println(2500);
	}
	D (int x){
		D d1 = new D ();
	}
	public static void main(String[] args) {
		D d1 = new D (250);
	}
// o/p 2500
}
