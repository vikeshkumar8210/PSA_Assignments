package day11;

public class E {
	E (int x, int y){
		System.out.println(x);
		System.out.println(y);
	}
	E (int x){
		this (23, 56);
	}
	E (){
		this (40);
	}
	public static void main(String[] args) {
		E e1 = new E ();
	}
// o/p 23, 56
}
