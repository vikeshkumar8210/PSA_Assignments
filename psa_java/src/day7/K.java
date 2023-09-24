package day7;
//Pre-increment
public class K {
	public static void main(String[] args) {
		int i = 10;
		int j = ++i + ++i;
		System.out.println(i);//12
		System.out.println(j);//23(11+12)
	}

}
