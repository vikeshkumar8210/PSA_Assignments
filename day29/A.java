package day29;
// Remove duplicate element in array.
public class A {
	public static void main(String[] args) {
		int[]x= {1,1,2,2,3,3,4,4};
		int[]temp= new int [x.length];
		int j =0;
		for (int i=0; i<temp.length-1; i++) {
			if (x[i]!=x[i+1]) {
				temp[j]=x[i];
				j++;
			}
		}
		temp[j]=x[x.length-1];
		for (int z=0; z<=j; z++) {
			System.out.println(temp[z]);
		}
		
		
	}

}
