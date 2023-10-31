package day37;
//finally
public class C {
	public static void main(String[] args) {
		try {
			int x= 10/0;
			
		}
		finally {
			System.out.println(1000);
		}
	}

}
//OutPut:-1000
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day37.C.main(C.java:6)
