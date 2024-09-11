package Array_Programing;

import java.util.Scanner;

public class Program_4_Type_PrintOddIndexElementOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Storing the element in array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
//		System.out.println("fetching odd index element");    
//		for(int i=0; i<a.length; i++) {							// Normal way
//			if(i%2!=0) {
//				System.out.println(a[i]);
//			}	
//		}
		
		
		boolean flag = false;
		System.out.println("fetching odd index element");
		for(int i=0; i<a.length; i++) {	
			if(i%2!=0) {
				flag=true;
				System.out.println(a[i]);
			}
		}
		if(flag==false) {
			System.out.println("Odd index is not present");
		}
	}
}
