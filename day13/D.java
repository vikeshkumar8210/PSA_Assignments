package day13;
// Where a subclass extends another subclass, creating a chain or hierarchy of classes is called as multi-level inheritance.
// Classes in java does not support multiple inheritance but interfaces in java support multiple inheritance.
public class D extends E{
	public static void main(String[] args) {
		D d1 = new D ();
		
		d1.test1();
		d1.test2();
	}

}
