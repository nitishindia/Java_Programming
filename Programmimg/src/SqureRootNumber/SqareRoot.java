package SqureRootNumber;

import java.util.Scanner;

public class SqareRoot {

	public static void main(String[] args) {
		
//		int n = 16;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			if(i*i==n) {
				System.out.println(i);
				break;
			}
		}
	}
}
