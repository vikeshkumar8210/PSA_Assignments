package day22;
// Exception Handling
// TO handle exception in java we use try catch block. 
//If any line of code throws exception in try block then try block will create exception object and will give objects address to catch block.
// catch block will suppress the exception and hence further code will continue to run.

public class B {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 20;
			int z = x/y;
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println(456);
	}

}
