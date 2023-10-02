package day24;
// RunTime Exception
// Arithmetic Exception:- In Java, an Arithmetic Exception is a runtime exception that occurs when invalid arithmetic operation is performed.
// This typically happens when you perform like division or modulo by zero, which are mathematically undefined.

public class A {
	public static void main(String[] args) {
		try {
			int x = 10;
			// int y = 20;// 0
			int y = 0;// error(java.lang.ArithmeticException: / by zero)
			int z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(456);
	}

}
