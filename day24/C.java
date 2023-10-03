package day24;
// NumberFormateException
// This is runtime Exception
// This exception occurs when we try to convert invalid string to a number as shown in below example:-

public class C {
	public static void main(String[] args) {
		try {
			//String x = "abc123"; //error
			String x = "500";
			int x1 = Integer.parseInt(x);
			System.out.println(x1);
			
			float x2 = Float.parseFloat(x);
			System.out.println(x2);
			
			long x3 = Long.parseLong(x);
			System.out.println(x3);
			
			double x4 = Double.parseDouble(x);
			System.out.println(x4);
			
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}

}
