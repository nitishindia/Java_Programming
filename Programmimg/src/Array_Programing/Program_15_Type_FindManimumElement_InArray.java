package Array_Programing;

public class Program_15_Type_FindManimumElement_InArray {

	public static void main(String[] args) {
		 
		int a [] = {9,6,4,6,7,8,9};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.print(min);

	}

}
