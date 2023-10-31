package day37;
//Finally
public class D {
	public static void main(String[] args) {
		try {
			int x=10/0;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.exit(0);//We have to use any Integer value .
			System.out.println(100);
		}
	}

}

//OutPut:-java.lang.ArithmeticException: / by zero

