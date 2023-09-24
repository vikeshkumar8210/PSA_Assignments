package day7;
// static and local variable names can be same.

public class G {
	static int x = 10;
	public static void main(String[] args) {
		int x = 20;
		System.out.println(G.x);
		System.out.println(x);
	}

}
