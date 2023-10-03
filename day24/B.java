package day24;
// NullPointer Exception
// It is Runtime Exception
// when we access non-static member with null reference variable we get null pointer exception.
public class B {
	int x = 10;
	public static void main(String[] args) {
		try {
			B b1 = null ;
			System.out.println(b1.x);
			System.out.println(10);
			
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(256);
	}

}
