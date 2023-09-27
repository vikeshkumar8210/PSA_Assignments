package day9;
// Using this keyword we can access non-static members.

public class E {
	int x = 20;
	public static void main(String[] args) {
		E e1 = new E ();
		System.out.println(e1.x);//20
		e1.test();
		
	}
	public void test () {
		System.out.println(this.x);//20
		System.out.println(x);//20
	}

}
