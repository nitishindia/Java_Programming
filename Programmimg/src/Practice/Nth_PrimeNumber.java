 package Practice;

import java.util.Scanner;

public class Nth_PrimeNumber {

	public static void main(String[] args) {
		
	//	int t = 10;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nth number to get prime number");
		int t = s.nextInt();
		
		int count1 = 0;
		
		for(int i=1; count1<t; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				count1++;
	//			System.out.println(i);
			}
			if(count1==t) {
				System.out.println(count1+"th number of prime number is "+ i);
		}
		
		}
	}

}
