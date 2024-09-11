package Array_Programing;

public class Program_12_Type_InsertElementBaseOnIndexValue {

	public static void main(String[] args) {
		
		int a[] = {1,3,4,5};
		int b[] = new int[a.length+1];
		int ele = 2;
		int ind = 1;
		int temp =0;
		for(int i=0; i<=b.length-1; i++) {
			if(i==ind) {
				b[i]=ele;
			}
			else {
				b[i]=a[temp++];
			}
		}
		for(int i=0; i<=b.length-1; i++) {
			System.out.print(b[i]);
		}

	}

}
