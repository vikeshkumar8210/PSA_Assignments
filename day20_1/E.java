package day20_1;

public class E {
	public static void main(String[] args) {
		C c1 = (int x, int y) ->{
			int z = x + y;
			System.out.println(z);
		};
		c1.add(12, 5);
		
		D d1 = (int x, int y) ->{
			int z = x * y;
			System.out.println(z);
		};
		d1.multiply(5, 10);
	}

}
