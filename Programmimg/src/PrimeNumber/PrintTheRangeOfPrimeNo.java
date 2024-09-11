package PrimeNumber;

import java.util.Scanner;

public class PrintTheRangeOfPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int s= sc.nextInt();
		System.out.println("Enter the end number");
		int e = sc.nextInt();
		
		for(int i=s; i<=e; i++) {
			int n=i;
			int count=0;
			
			for (int j=1; j<=n; j++) {
			if (n%j==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(n);
			}
		}
	}

}
