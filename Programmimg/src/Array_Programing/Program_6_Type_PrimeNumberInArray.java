package Array_Programing;

import java.util.Scanner;

public class Program_6_Type_PrimeNumberInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the element in the array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			int num = a[i];
			int count = 0;
			for(int j=1; j<=num; j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
			System.out.println(num);
			}
		}

	}

}
