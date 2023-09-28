package day10;

public class D {
	D (int x){
		System.out.println(x);
	}
	D (){
		this(25);
	}
	public static void main(String[] args) {
		D d1 = new D ();
	}
	

}
