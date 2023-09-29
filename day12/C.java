package day12;
// When an object with argument & object with argument are both created in same program then default constructor are not applicable and hence below program throws error.

public class C {
	C (int x){
		
	}
	public static void main(String[] args) {
		C c1 = new  C (100);
		C c2 = new C ();//error
	}

}
