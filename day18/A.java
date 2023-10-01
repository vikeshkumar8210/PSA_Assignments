package day18;
// If you make variable final then changing it's value is not allowed
public class A {
	public static void main(String[] args) {
		final int x = 10;
		x = 20;//error
		System.out.println(x);
	}

}
