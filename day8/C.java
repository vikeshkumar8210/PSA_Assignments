package day8;
// we can use "return" keyword only inside void method.
// It is optional to be used 
// It will return control back to method calling statement.
public class C {
	public static void main(String[] args) {
		C c1 = new C ();
		c1.test();
		
	}
	public void test () {
		System.out.println(100);
		return ;
	}

}
