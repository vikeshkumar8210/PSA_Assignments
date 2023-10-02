package day23;
// e.printStackTrace(); 
// This will gives us exact line number where the exception occured.
public class A {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 20;
			int z = x/y;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(120);
	}

}

//    Types of Exception
// 1> CheckedException/CompileTime Exception :- These exception are seen when we compile a program in java.
// 2> UncheckedException/ RunTime Exception :- These Exception sre see during RunTime of the program.
