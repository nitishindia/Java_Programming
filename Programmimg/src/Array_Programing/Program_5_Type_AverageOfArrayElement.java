package Array_Programing;

import java.util.Scanner;

public class Program_5_Type_AverageOfArrayElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("enter the array element");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("After storing arr ele");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			sum=sum+a[i];	
		}
		System.out.println();
		System.out.println("Sum of the element = "+sum);
		System.out.println("length of the element = "+a.length);
		System.out.println("Avarage of the array element = "+sum/a.length);
	//	System.out.println(sum/a.length);

	}

}
