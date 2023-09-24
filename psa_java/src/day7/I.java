package day7;

public class I {
	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i++;
		System.out.println(i);// i = 12
		System.out.println(j);// j = 21(10+11)
	}
// post- increment
}
