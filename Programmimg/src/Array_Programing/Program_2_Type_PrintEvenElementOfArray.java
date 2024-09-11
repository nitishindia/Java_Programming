package Array_Programing;

import java.util.Scanner;

public class Program_2_Type_PrintEvenElementOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
			int size = sc.nextInt();
			int a[] = new int[size];
			System.out.println("enter the array element");
			for(int i=0; i<a.length; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("print the even element");
			for (int i = 0; i < a.length; i++) {
				if(a[i]%2==0) {
					System.out.println(a[i]);
				}
			}
	}

}
