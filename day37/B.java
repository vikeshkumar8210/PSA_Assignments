package day37;
//Finally (It is a Extension of try and catch block)

public class B {
	public static void main(String[] args) {
		try {
			int x=10/0;	
		}catch(Exception e) {
		
			System.out.println(e);
		}finally {
			System.out.println(1000);
		}
	}

}

//OutPut:-java.lang.ArithmeticException: / by zero
1000

