package Array_Programing;

import java.util.Scanner;

public class Program_3_Type_Flag_PrintEvenElementOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Storing the element");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		boolean flag = false;
		System.out.println("Printing the even element");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
			flag=true;
			System.out.println(a[i]);
			}	
		}
		if(flag==false) {
			System.out.println("Even element is not present");
			}
	}
}
