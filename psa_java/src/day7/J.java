package day7;
// post- increment
public class J {
	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i + i++;
		System.out.println(i);//12
		System.out.println(j);//32(10+11+11)
	}
	

}
