package day20;
@FunctionalInterface
public interface C {
	public void test1();
	default void test2 () {
		System.out.println(123);
	}
	default void test3 () {
		System.out.println(456);
	}

}
