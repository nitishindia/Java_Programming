package Array_Programing;

public class Program_17_Type_SortArrayElement_AssendingOdr_BubbleSort {

	public static void main(String[] args) {
		
		int a [] = {8,9,4,5,2,7,1,3,6};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
