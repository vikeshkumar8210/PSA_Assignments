package day19;
// Static compute methods & main method is allowed in an interface in java 8.

public interface C {
	public static void test () {
		System.out.println(450);
	}
	public static void main(String[] args) {
		C.test();
	}

}
