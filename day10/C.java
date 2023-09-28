package day10;
// We can call constructor using this keyword but ensure the call is made from another constructor.

public class C {
	C (){
		System.out.println(15);
	}
	C (int x){
		this ();
		
	}
	public static void main(String[] args) {
		C c1 = new C ();
	}

}
