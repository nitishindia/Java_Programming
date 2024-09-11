package Array_Programing;

import java.util.Scanner;

public class Program_1_Type_Dinamic_CreateAndPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Before storing arr ele");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("enter the array element");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("After storing arr ele");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
