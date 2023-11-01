package day38;

public class C {
	public static void main(String[] args) {
		try {
			Integer.parseInt("mikechup");
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


OutPut:-3
