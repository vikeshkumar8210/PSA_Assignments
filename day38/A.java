package day38;

// Multiple Catch block
public class A {
	public static void main(String[] args) {
		try {
			int x=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(1);
		}catch(NullPointerException e) {
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}
	}

}

//OutPut:- 1
