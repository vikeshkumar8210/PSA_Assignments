package day20_1;
// Note:- Functional Interface does not supports multiple inheritance.
@FunctionalInterface
public interface F extends C, D{//error
	public void test3();

}
