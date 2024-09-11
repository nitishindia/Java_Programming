package Array_Programing;

import java.util.Scanner;

public class Program_7_Type_CopyOneArrayElementToAnotherArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the element in the array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int b[] = new int[a.length];
		
		System.out.println("Storing 'a' Array element to 'b' Array");
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i]);
		}
		

	}

}
