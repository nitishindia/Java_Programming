package Multiplication_Table;

import java.util.Scanner;

public class MultipleBetweenRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int s = sc.nextInt();
		System.out.println("Enter last number");
		int e = sc.nextInt();
		
		for(int i=s; i<=e; i++) {
			int n = i;
			for(int j=1; j<=10; j++) {
				int m = n*j;
				System.out.println(n+"*"+j+"="+m);
			}
			System.out.println();
		}

	}

}
