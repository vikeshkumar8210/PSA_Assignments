package day14;
// When you make a constructor private then it's object cannot created outside the class but can be created only inside same class.
// When you make a constructor default then it's object can be created inside same package but not outside the package.
// When you make a constructor Protected then it's object can be created inside same package but not outside the package.
// When you make a constructor Public then it's object can be created inside same package and outside the package.
public class A {// error
	private A () {
		
	}
	public static void main(String[] args) {
		A a1 = new A ();
	}

}
