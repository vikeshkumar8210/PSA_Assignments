package day38;

public class B {
	int x=10;
	public static void main(String[] args) {
		try {
			B b1=null;
			System.out.println(b1.x);
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

OutPut:- 2
