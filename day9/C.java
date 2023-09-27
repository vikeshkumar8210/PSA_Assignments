package day9;
// Here we create more than one constructor in same class provided that have different number of argument or different type of arguments.

public class C {
	C (){// no. of argument = 0
		System.out.println(1);
	}
	C (int x){// no. argument = 1
		System.out.println(x);
	}
	C (int x, int y){// no. of arguments = 2
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		C c1 = new C (10, 75);
		C c2 = new C (20, 50);
		C c3 = new C (30, 40);
	}

}
