package day5;
// We can access static variable in 3 ways
// 1. Classname.variable
// 2. variable
// 3. Reference variable.variable (wrong)
public class G {
	static int x ;
	public static void main(String[] args) {
		System.out.println(G.x);
		System.out.println(x);
		
		
		G g1 = new G ();
		System.out.println(g1.x);
	}

}
