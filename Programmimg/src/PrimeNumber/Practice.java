package PrimeNumber;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int s = sc.nextInt();
		System.out.println("Enter the end number");
		int e = sc.nextInt();
		
		
		int sum = 0;
		for(int i=s; i<=e; i++) {
			int n=i;
			int count = 0;
			
			for(int j=1; j<=e; j++) {
				if(n%j==0) {
					count++;
				}
			}
			if(count==2) {
			sum=sum+n;
			System.out.println(n);
			}			
		}
		System.out.println(sum);
	}
}
