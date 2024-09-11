package Array_Programing;

public class Program_14_Type_FindMaximumElement_InArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,9,6,3,7,2,11};
			int max=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
