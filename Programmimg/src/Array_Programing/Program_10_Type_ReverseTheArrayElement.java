package Array_Programing;

public class Program_10_Type_ReverseTheArrayElement {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int b[] = new int[a.length];
		int temp = 0;
		for(int i=a.length-1; i>=0; i--) {
			b[temp++] = a[i];
		}
		for(int i=0; i<=b.length-1; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
