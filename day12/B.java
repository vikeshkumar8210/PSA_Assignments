package day12;
// In your B class, you haven't defined any constructor explicity with arguments. 
// Java cannot create default constructor for object's with arguments.
// Hence below program throws error.
public class B {
	public static void main(String[] args) {
		B b1 = new B (500);//error
	}

}
